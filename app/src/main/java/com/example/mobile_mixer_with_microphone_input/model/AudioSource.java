package com.example.mobile_mixer_with_microphone_input.model;

public class AudioSource {
    public int id, level;
    public String URI, status;

    public AudioSource(){
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public AudioSource(int id, int level, String URI, String status) {
        this.id = id;
        this.level = level;
        this.URI = URI;
        this.status = status;
    }


    public void changeStatus(String status){};


}
