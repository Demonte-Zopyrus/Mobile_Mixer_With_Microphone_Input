package com.example.mobile_mixer_with_microphone_input;

import java.util.List;

// This is the session which would hold all the sources and sinks
public class Session {
    public int id;
    public String processingAudioFormat;
    public List sources, sinks;

    public void listen(){};
    public void play(){};
    public void saveConfig(){};
    public void loadConfig(){};
}
