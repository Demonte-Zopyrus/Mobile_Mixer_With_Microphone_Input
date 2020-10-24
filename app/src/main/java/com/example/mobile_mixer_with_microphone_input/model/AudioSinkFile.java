package com.example.mobile_mixer_with_microphone_input.model;
// This class would be a audio sink device capturing all the audios currently playing on the system
// and capture that data to a file
// Potentially can use the screen recorder api


public class AudioSinkFile {
    public int id, level;
    public String URI, status, outputFormat;

    public void initSink(String URI, String format){};
    public void changeStatus(String status){};
    public void deleteSink(){};
    public void changeLevel(int id){};
    public void changeFormat(String format){};

}
