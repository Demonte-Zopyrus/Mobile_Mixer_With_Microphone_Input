package com.example.mobile_mixer_with_microphone_input;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.mobile_mixer_with_microphone_input.model.AudioSinkFile;
import com.example.mobile_mixer_with_microphone_input.model.AudioSource;
import com.example.mobile_mixer_with_microphone_input.model.Session;
import com.example.mobile_mixer_with_microphone_input.util.sync_config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void syncSession(){
        AudioSource source = new AudioSource(123,456,"source","def");
        AudioSinkFile sink = new AudioSinkFile(987,654,"sink","abc","mp3");
        List<AudioSource> sources =new ArrayList<>();
        List<AudioSinkFile> sinks =new ArrayList<>();
        sources.add(source);
        sinks.add(sink);
        Session session = new Session(123,"wmv",sources,sinks);

        sync_config.upload_session("user1",session);

        Session fetched = sync_config.fetch_session("user1");

        assertEquals(123,fetched.id);
        assertEquals("wmv",fetched.processingAudioFormat);
        assertEquals(456,fetched.sources.get(0).level);
        assertEquals(987,fetched.sinks.get(0).id);

    }
}