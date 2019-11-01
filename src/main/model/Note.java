package model;

import java.applet.AudioClip;
import java.util.HashMap;
import java.util.Map;

public class Note {
    private Map<String, AudioClip> noteMap;

    //13 notes in an octave
    Note() {
        noteMap = new HashMap<>();
    }

    public void playPianoNote(String key) {
        Instrument piano = new Piano();
        Map<String, Note> keys = piano.getCurKeys();
        playNote(keys.get(key));
    }

    public void playNote(Note n) {
        System.out.println("Play the audio clip associated with n");
    }
}





