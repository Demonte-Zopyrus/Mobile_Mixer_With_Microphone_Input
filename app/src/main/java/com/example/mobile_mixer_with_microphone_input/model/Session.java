package com.example.mobile_mixer_with_microphone_input.model;

import java.util.List;

// This is the session which would hold all the sources and sinks
public class Session {
    public int id;
    public String processingAudioFormat;
    public List<AudioSource> sources;
    public List<AudioSinkFile> sinks;

    Session(){
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Session(int id, String processingAudioFormat, List<AudioSource> sources, List<AudioSinkFile> sinks) {
        this.id = id;
        this.processingAudioFormat = processingAudioFormat;
        this.sources = sources;
        this.sinks = sinks;
    }

    public void listen(){};
    public void play(){};
    public void saveConfig(){};
    public void loadConfig(){};
}
