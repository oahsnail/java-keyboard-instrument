package ui;

import model.Instrument;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.IOException;



public class Main {


    public static void main(String[] args) throws IOException {
//        JFrame frame = new JFrame();
//        JPanel panel = new JPanel(new FlowLayout());
//        JTextField field = new JTextField(20);
//        panel.add(field);
//        frame.getContentPane().add(panel);
//
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setVisible(true);

        Scanners.start();

    }


}