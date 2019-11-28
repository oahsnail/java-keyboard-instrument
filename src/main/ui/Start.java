package ui;


import model.Instrument;
import model.Piano;
import model.Synthesizer;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.InputMismatchException;


public class Start extends JFrame implements ActionListener {

    private static JTextField textField;
    private static JButton button;
    private static JLabel label;
    private static JFrame frame;

    public Start() {
    }


    //MODIFIES: this
    //EFFECTS: Creates a new JFrame GUI with a textfield and a enter button.
    public static void main(String[] args) {
        frame = new JFrame("Instrument Selector");
        label = new JLabel("Choose: 'Piano' or 'Synthesizer?'");
        button = new JButton("Enter");
        textField = new JTextField(30);
        JPanel panel = new JPanel();

        Start s = new Start();

        panel.add(label);
        panel.add(button);
        panel.add(textField);
        frame.add(panel);

        button.addActionListener(s);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }


    //MODIFIES: this
    //EFFECTS: Parses textField to select appropriate instrument.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (textField.getText().equals("Piano")) {
                Instrument piano = new Piano();
            } else if (textField.getText().equals("Synthesizer")) {
                try {
                    Instrument s = new Synthesizer();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            label.setText("You selected: " + textField.getText());
            textField.setText("Reselect: 'Piano' or 'Synthesizer?'");
        }
    }


}
