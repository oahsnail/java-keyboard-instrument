package model;


import ui.PianoMaker;
import ui.SoundPlayer;

public class Piano extends Instrument {


    public Piano() {
        PianoMaker inst = new PianoMaker(this.getOctave());
        inst.setVisible(true);
    }



}
