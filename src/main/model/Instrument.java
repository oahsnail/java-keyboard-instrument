package model;


import model.exceptions.OctaveOutOfBoundsException;
import observer.OctaveSave;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;


public abstract class Instrument extends Observable {
    private int octave;


    //EFFECT: Constructs an Instrument with octave as 0
    public Instrument() {
        this.octave = 0;
        addObserver(new OctaveSave());

    }


    //MODIFIES: this
    //EFFECT: moves the domain of the instrument based on integer

    public int setOctave(int octave) throws OctaveOutOfBoundsException {
        this.octave = octave;
        setChanged();
        notifyObservers(octave);

        if (octave < 0) {
            throw new OctaveOutOfBoundsException();
        }
        return this.octave;
    }

    public int getOctave() {
        return octave;
    }
}
