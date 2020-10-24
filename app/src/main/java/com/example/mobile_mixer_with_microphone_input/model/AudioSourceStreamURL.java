package com.example.mobile_mixer_with_microphone_input.model;
// stream class would be different than play classes as it would not have a progress bar
// Should also be easy to implement as it is playing an URI using presumably android's music api
public class AudioSourceStreamURL extends AudioSource{
    public int id, level;
    public String URI, status;

    public void initSource(String URI){};
    public void deleteSource(){};
    public void changeLevel(int id){};
}
