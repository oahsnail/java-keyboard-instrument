package model;

import java.applet.AudioClip;
import java.util.HashMap;
import java.util.Map;

public class Note {
    private Map<String, AudioClip> note;

    //13 notes in an octave
    Note() {
        note = new HashMap<>();
    }

    public void playPianoNote(String key) {
        Piano piano = new Piano();
        Map<String, Note> keys = piano.getCurrentKeys();
        playNote(keys.get(key));
    }

    public void playNote(Note n) {
        System.out.println("Play the audio clip associated with n");
    }
}





