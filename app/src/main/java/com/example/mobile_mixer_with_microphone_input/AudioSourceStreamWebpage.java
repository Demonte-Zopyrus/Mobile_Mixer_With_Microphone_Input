package com.example.mobile_mixer_with_microphone_input;
// This would open a web page and let user load pages, upon hitting back, the web page would remain
// open in the background until the user either delete the element or exit the page
public class AudioSourceStreamWebpage {
    public int id, level;
    public String URI, status;

    public void initSource(String URI){};
    public void changeStatus(String status){};
    public void deleteSource(){};
    public void changeLevel(int id){};
}
