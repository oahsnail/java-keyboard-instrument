package ui;


import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SoundPlayer {


    //EFFECTS: plays a audio file give the file path
    public static void playSound(String filePath) {
        InputStream sound;

        try {
            sound = new FileInputStream(new File(filePath));
            AudioStream audioStream = new AudioStream(sound);
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }


}
