package ui;

import java.io.IOException;
import java.util.Scanner;

import model.Instrument;
import model.Piano;
import model.Synthesizer;
import model.exceptions.OctaveOutOfBoundsException;
import network.ReadWebPage;

public class Scanners {

    private static Scanner scanner;
    private static Piano piano;


    //EFFECT: Sets up text box with options
    public void start() throws IOException {
        String operation = "";

        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Instrument: 'piano' or 'synthesizer'? Or 'options' / 'quit'");
            operation = scanner.nextLine();
            System.out.println("You selected: " + operation);
            if (operation.equals("quit")) {
                break;
            } else if (operation.equals("piano")) {
                piano = new Piano();
                ReadWebPage r = new ReadWebPage();
                r.main();
                options(piano);
            } else if (operation.equals("synthesizer")) {
                Instrument s = new Synthesizer();
            }
        }

    }

    public static void options(Instrument instrument) {
        int operation;
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Set Octave:");
            operation = scanner.nextInt();
            try {
                instrument.setOctave(operation);
                System.out.println("Octave is set to: " + instrument.getOctave());

            } catch (OctaveOutOfBoundsException o) {
                System.out.println("Octave must be above 1");
            }

        }
    }
}
