package model;


import model.exceptions.OctaveOutOfBoundsException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public abstract class Instrument {
    //private ArrayList<String> currentNotes;
    private int octave;



    //EFFECT: Constructs an Instrument with octave as 0
    public Instrument() {
        octave = 0;


    }


    //MODIFIES: this
    //EFFECT: moves the domain of the instrument based on integer
    //
    public int setOctave(int octave) throws OctaveOutOfBoundsException {
        this.octave = this.octave + octave;

        if (octave < 0) {
            throw new OctaveOutOfBoundsException();
        }
        try {
            setOctave(-1);
        } catch (OctaveOutOfBoundsException o) {
            System.out.println("octave can't be below 0 \n");
        } finally {
            if (octave < 0) {
                setOctave(0);
            }
        }
        return this.octave;
    }




}
