package com.example.mobile_mixer_with_microphone_input;
// Most basic type of audio files. would play open loaded by UI element (maybe a play button?)
public class AudioSourcePlayFile {
    public int id, level;
    public String URI, status;

    public void initSource(String URI){};
    public void changeStatus(String status){};
    public void deleteSource(){};
    public void changeLevel(int id){};
}
