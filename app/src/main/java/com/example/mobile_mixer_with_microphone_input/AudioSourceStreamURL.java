package com.example.mobile_mixer_with_microphone_input;
// stream class would be different than play classes as it would not have a progress bar
// Should also be easy to implement as it is playing an URI using presumably android's music api
public class AudioSourceStreamURL {
    public int id, level;
    public String URI, status;

    public void initSource(String URI){};
    public void changeStatus(String status){};
    public void deleteSource(){};
    public void changeLevel(int id){};
}
