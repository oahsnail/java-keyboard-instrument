package model;

import java.util.HashMap;
import java.util.Map;

public class Piano extends Instrument {
    private Map<String, Note> currentKeys; //key button and note


    public void piano() {
        currentKeys = new HashMap<>();
    }

    public void addNote(String key, Note note) {
        currentKeys.put(key, note);
    }

    public void playCurrentNotes() {
        currentKeys.forEach((note, s) -> {
            System.out.println(s);
        });
    }

    public Map<String, Note> getCurrentKeys() {
        return currentKeys;
    }
}
