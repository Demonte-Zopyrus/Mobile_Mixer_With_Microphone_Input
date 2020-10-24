package com.example.mobile_mixer_with_microphone_input.util;

import android.util.Log;

import com.example.mobile_mixer_with_microphone_input.model.Session;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class sync_config {
    DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
    private static final String TAG = "sync_config";

    sync_config(){

    }

    public void upload_session(String userId, Session session){
        mDatabase.child("UserSessions").child(userId).setValue(session);
    }

    public Session fetch_session(String userId){

        DatabaseReference mSessionRef = mDatabase.child("UserSessions").child(userId);
        final Session[] userSession = new Session[1];


        ValueEventListener sessionListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Session object and use the values to update the UI
                userSession[0] = dataSnapshot.getValue(Session.class);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadSession:onCancelled", databaseError.toException());
                // ...
            }
        };

        mSessionRef.addListenerForSingleValueEvent(sessionListener);
        mSessionRef.removeEventListener(sessionListener);
        return userSession[0];

    }

}
