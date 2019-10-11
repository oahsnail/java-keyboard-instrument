package model;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


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
    //        if instrument if positive, the move the domain up, vice versa.
    public int octaveChange(int o) {
        this.octave = this.octave + o;

        return this.octave;
    }



}
