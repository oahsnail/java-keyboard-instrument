package model;


import model.exceptions.OctaveOutOfBoundsException;

import java.io.IOException;


public abstract class Instrument {
    //private ArrayList<String> currentNotes;
    int octave;
    String instType;


    //EFFECT: Constructs an Instrument with octave as 0
    public Instrument() {
        octave = 0;
        instType = "none";
        //currentNotes = new ArrayList<>();

    }

    //MODIFIES: this
    //EFFECT: Selects the instrument type.
    public void setInstType(String instType) throws IOException {
        this.instType = instType;
        if (instType == "piano") {
            Piano.piano();
        } else {
            Synthesizer s1 = new Synthesizer();
            s1.synthesizer();

        }
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
