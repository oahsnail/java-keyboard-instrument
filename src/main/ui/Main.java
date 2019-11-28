package ui;


import model.Piano;

import java.io.IOException;
import java.util.InputMismatchException;


public class Main {


    public static void main(String[] args) throws IOException {

        Scanners s = new Scanners();
        try {
            s.start();
        } catch (InputMismatchException i) {
            System.out.println("Unexpected input, try again or quit");
            s.start();
        }

    }


}