package com.example.mobile_mixer_with_microphone_input;
// There should be only one instance of the mic class that is build in and should not be able to be
// deleted

public class AudioSourceMic {
    public int id, level;
    public String status;

    public void initSource(){};
    public void changeStatus(String status){};
    public void changeLevel(int id){};
}
