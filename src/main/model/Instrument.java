package model;


import model.exceptions.OctaveOutOfBoundsException;

import java.util.Observable;


public abstract class Instrument {
    private int octave;


    //EFFECT: Constructs an Instrument with octave as 0
    public Instrument() {
        this.octave = 0;

    }


    //MODIFIES: this
    //EFFECT: moves the domain of the instrument based on integer

    public int setOctave(int octave) throws OctaveOutOfBoundsException {
        this.octave = octave;

        if (octave < 0) {
            throw new OctaveOutOfBoundsException();
        }
        return this.octave;
    }

    public int getOctave() {
        return octave;
    }
}
