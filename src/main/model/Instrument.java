package model;


import java.util.ArrayList;
import java.util.Scanner;


public class Instrument {
    //private ArrayList<String> currentNotes;
    private int octave;
    private Scanner scanner;
    private String instType;

    public Instrument() {
        octave = 0;
        scanner = new Scanner(System.in);
        //currentNotes = new ArrayList<>();
        start();


    }

    private void setInstType(String instType) {
        this.instType = instType;
        instChooser();
    }

    private void instChooser() {
        if (instType == "piano") {
            Piano.piano();
        } else {
            Synthesizer.synthesizer();
        }
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }


    private int octaveUp() {
        this.octave++;
        System.out.println("Turned octave up by 1");
        return this.octave;

    }

    private int octaveDown() {
        this.octave--;
        System.out.println("Turned octave down by 1");
        return this.octave;

    }

    private void start() {
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
