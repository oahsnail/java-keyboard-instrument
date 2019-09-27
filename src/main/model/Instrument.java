package model;


import java.util.ArrayList;
import java.util.Scanner;


public class Instrument {
    //private ArrayList<String> currentNotes;
    int octave;
    Scanner scanner;
    String instType;


    //EFFECT: Constructs an Instrument
    public Instrument() {
        octave = 0;
        scanner = new Scanner(System.in);
        //currentNotes = new ArrayList<>();

    }

    //MODIFIES: this
    //EFFECT: Selects the instrument type.
    public void setInstType(String instType) {
        this.instType = instType;
        if (instType == "piano") {
            Piano.piano();
        } else {
            Synthesizer.synthesizer();
        }
    }


    //MODIFIES: this
    //EFFECT: Moves the domain of the instrument 1 octave higher
    public int octaveUp() {
        this.octave++;
        System.out.println("Turned octave up by 1");
        return this.octave;

    }

    //MODIFIES: this
    //EFFECT: Moves the domain of the instrument 1 octave lower
    public int octaveDown() {
        this.octave--;
        System.out.println("Turned octave down by 1");
        return this.octave;

    }


    //EFFECT: Sets up text box with options
    public void start() {
        String operation = "";

        while (true) {
            System.out.println("Instrument: 'piano' or 'synthesizer'? Options: 'octaveup', 'octavedown', 'quit'");
            operation = scanner.nextLine();
            System.out.println("You selected: " + operation);
            if (operation.equals("quit")) {
                break;
            } else if (operation.equals("piano")) {
                setInstType("piano");
            } else if (operation.equals("synthesizer")) {
                setInstType("synthesizer");
            } else if (operation.equals("octaveup")) {
                System.out.println("octave is now " + octaveUp());
            } else if (operation.equals("octavedown")) {
                System.out.println("octave is now " + octaveDown());
            }

        }

    }

}
