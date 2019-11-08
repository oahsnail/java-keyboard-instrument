package ui;

import java.io.IOException;
import java.util.Scanner;

import model.Instrument;
import model.Piano;
import model.Synthesizer;
import model.exceptions.OctaveOutOfBoundsException;

public class Scanners {

    private static Scanner scanner;


    //EFFECT: Sets up text box with options
    public static void start() throws IOException {
        String operation = "";

        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Instrument: 'piano' or 'synthesizer'? Or 'quit'");
            operation = scanner.nextLine();
            System.out.println("You selected: " + operation);
            if (operation.equals("quit")) {
                break;
            } else if (operation.equals("piano")) {
                options();
            } else if (operation.equals("synthesizer")) {
                Instrument s = new Synthesizer();
                options();
            }
        }

    }

    public static void options() {
        int operation;
        scanner = new Scanner(System.in);
        Instrument p = new Piano();

        while (true) {
            System.out.println("Set Octave:");
            operation = scanner.nextInt();
            try {
                p.setOctave(operation);
                System.out.println("Octave is set to: " + p.getOctave());
            } catch (OctaveOutOfBoundsException o) {
                System.out.println("Octave must be above 1");
            }


        }
    }
}
