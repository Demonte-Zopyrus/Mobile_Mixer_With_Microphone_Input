package com.example.mobile_mixer_with_microphone_input.model;
// There should be only one instance of the mic class that is build in and should not be able to be
// deleted

public class AudioSourceMic extends AudioSource {

    public AudioSourceMic(int id, int level, String status) {
        super(id,level,"Mic",status);
    }

    public void initSource(String URI){};
    public void changeLevel(int id){};


}
