package ui;

import model.Piano;

public class PianoPlayer {

    //EFFECTS: plays the low C note in it's given octave
    public static void playC(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/C" + s + ".wav");
    }

    //EFFECTS: plays the C# note in it's given octave
    public static void playCSharp(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/C#" + s + ".wav");
    }

    //EFFECTS: plays the D note in it's given octave
    public static void playD(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/D" + s + ".wav");
    }

    //EFFECTS: plays the D# note in it's given octave
    public static void playDSharp(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/D#" + s + ".wav");
    }

    //EFFECTS: plays the E note in it's given octave
    public static void playE(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/E" + s + ".wav");
    }

    //EFFECTS: plays the F note in it's given octave
    public static void playF(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/F" + s + ".wav");
    }

    //EFFECTS: plays the F# note in it's given octave
    public static void playFSharp(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/F#" + s + ".wav");
    }

    //EFFECTS: plays the G note in it's given octave
    public static void playG(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/G" + s + ".wav");
    }

    //EFFECTS: plays the G# note in it's given octave
    public static void playGSharp(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/G#" + s + ".wav");
    }

    //EFFECTS: plays the A note in it's given octave
    public static void playA(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/A" + s + ".wav");
    }

    //EFFECTS: plays the A# note in it's given octave
    public static void playASharp(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/A#" + s + ".wav");
    }

    //EFFECTS: plays the B note in it's given octave
    public static void playB(int octave) {
        String s = Integer.toString(octave);
        SoundPlayer.playSound("data/PianoNotes/B" + s + ".wav");
    }

    //EFFECTS: plays the high C note in it's given octave
    public static void playCh(int octave) {
        String s = Integer.toString(octave + 1);
        SoundPlayer.playSound("data/PianoNotes/C" + s + ".wav");
    }



}
