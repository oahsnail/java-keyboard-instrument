package ui;

import model.exceptions.OctaveOutOfBoundsException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PianoMaker extends JFrame implements ActionListener, InstrumentMaker {

    private JButton keyC = new JButton("C");
    private JButton keyD = new JButton("D");
    private JButton keyE = new JButton("E");
    private JButton keyF = new JButton("F");
    private JButton keyG = new JButton("G");
    private JButton keyA = new JButton("A");
    private JButton keyB = new JButton("B");
    private JButton keyCh = new JButton("C");
    private JButton keyCSharp = new JButton("C#");
    private JButton keyDSharp = new JButton("D#");
    private JButton keyFSharp = new JButton("F#");
    private JButton keyGSharp = new JButton("G#");
    private JButton keyASharp = new JButton("A#");

    private JLabel octaveAdjust = new JLabel("Octave");
    private JButton octavePlus = new JButton("Up");
    private JButton octaveMinus = new JButton("Down");

    private int localOctave;
    private static final int UPPER_LIMIT = 2;
    private static final int LOWER_LIMIT = 0;

    public PianoMaker(int octave) {
        super("Piano");
        localOctave = octave;

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1000, 500);

        setLayout(null);

        octaveAdjust.setBounds(70, 10, 100, 100);
        octaveMinus.setBounds(10, 80, 80, 50);
        octavePlus.setBounds(90, 80, 80, 50);

        keyC.setBounds(100, 300, 100, 150);
        keyD.setBounds(200, 300, 100, 150);
        keyE.setBounds(300, 300, 100, 150);
        keyF.setBounds(400, 300, 100, 150);
        keyG.setBounds(500, 300, 100, 150);
        keyA.setBounds(600, 300, 100, 150);
        keyB.setBounds(700, 300, 100, 150);
        keyCh.setBounds(800, 300, 100, 150);
        keyCSharp.setBounds(150, 150, 100, 150);
        keyDSharp.setBounds(250, 150, 100, 150);
        keyFSharp.setBounds(450, 150, 100, 150);
        keyGSharp.setBounds(550, 150, 100, 150);
        keyASharp.setBounds(650, 150, 100, 150);
        keyC.setBackground(Color.white);
        keyD.setBackground(Color.white);
        keyE.setBackground(Color.white);
        keyF.setBackground(Color.white);
        keyG.setBackground(Color.white);
        keyA.setBackground(Color.white);
        keyB.setBackground(Color.white);
        keyCh.setBackground(Color.white);
        keyCSharp.setBackground(Color.black);
        keyDSharp.setBackground(Color.black);
        keyFSharp.setBackground(Color.black);
        keyGSharp.setBackground(Color.black);
        keyASharp.setBackground(Color.black);
        getContentPane().add(keyC);
        getContentPane().add(keyD);
        getContentPane().add(keyE);
        getContentPane().add(keyF);
        getContentPane().add(keyG);
        getContentPane().add(keyA);
        getContentPane().add(keyB);
        getContentPane().add(keyCh);
        getContentPane().add(keyCSharp);
        getContentPane().add(keyDSharp);
        getContentPane().add(keyFSharp);
        getContentPane().add(keyGSharp);
        getContentPane().add(keyASharp);
        getContentPane().add(octaveAdjust);
        getContentPane().add(octavePlus);
        getContentPane().add(octaveMinus);

        octaveMinus.addActionListener(this);
        octavePlus.addActionListener(this);
        keyC.addActionListener(this);
        keyCSharp.addActionListener(this);
        keyD.addActionListener(this);
        keyDSharp.addActionListener(this);
        keyE.addActionListener(this);
        keyF.addActionListener(this);
        keyFSharp.addActionListener(this);
        keyG.addActionListener(this);
        keyGSharp.addActionListener(this);
        keyA.addActionListener(this);
        keyASharp.addActionListener(this);
        keyB.addActionListener(this);
        keyCh.addActionListener(this);
    }


    //EFFECTS: listens for what white keys (except ch) are pressed then plays the corresponding audio file
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == keyC) {
            PianoPlayer.playC(this.localOctave);

        }  else if (e.getSource() == keyD) {
            PianoPlayer.playD(this.localOctave);

        } else if (e.getSource() == keyE) {
            PianoPlayer.playE(this.localOctave);

        } else if (e.getSource() == keyF) {
            PianoPlayer.playF(this.localOctave);

        } else if (e.getSource() == keyG) {
            PianoPlayer.playG(this.localOctave);

        } else if (e.getSource() == keyA) {
            PianoPlayer.playA(this.localOctave);

        } else if (e.getSource() == keyB) {
            PianoPlayer.playB(this.localOctave);
        }
        playSharpKeysAndCh(e);
        changeOctaves(e);
    }

    //listens for what sharp keys (and ch) are pressed then plays the corresponding audio file
    public void playSharpKeysAndCh(ActionEvent e) {
        if (e.getSource() == keyCSharp) {
            PianoPlayer.playCSharp(this.localOctave);

        } else if (e.getSource() == keyDSharp) {
            PianoPlayer.playDSharp(this.localOctave);

        } else if (e.getSource() == keyFSharp) {
            PianoPlayer.playFSharp(this.localOctave);

        } else if (e.getSource() == keyGSharp) {
            PianoPlayer.playGSharp(this.localOctave);

        } else if (e.getSource() == keyASharp) {
            PianoPlayer.playASharp(this.localOctave);

        } else if (e.getSource() == keyCh) {
            PianoPlayer.playCh(this.localOctave);
        }

    }


    //MODIFIES: this
    //EFFECTS: changes the octave by one in a direction based on the buttons
    public void changeOctaves(ActionEvent e) {
        try {
            if (e.getSource() == octavePlus) {
                if (localOctave >= UPPER_LIMIT) {
                    throw new OctaveOutOfBoundsException();
                }
                this.localOctave++;
            }
            if (e.getSource() == octaveMinus) {
                if (localOctave <= LOWER_LIMIT) {
                    throw new OctaveOutOfBoundsException();
                }
                this.localOctave--;
            }
        } catch (OctaveOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Octave out of bounds");
        }

    }

}



