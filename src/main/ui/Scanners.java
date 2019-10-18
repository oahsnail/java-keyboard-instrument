package ui;

import java.io.IOException;
import java.util.Scanner;

import model.Instrument;
import model.Piano;
import model.Synthesizer;

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
                Instrument p = new Piano();
                p.setInstType("piano");
            } else if (operation.equals("synthesizer")) {
                Instrument s = new Synthesizer();
                s.setInstType("synthesizer");
            }
        }

    }

    public static int options() {
        int operation = 0;
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("How much octave change by?");
            operation = scanner.nextInt();
            System.out.println("You selected: " + operation);

            return operation;
        }
    }
}
