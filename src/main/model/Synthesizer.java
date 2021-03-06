package model;

//contain sounds for synthesizers

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.NoSuchFileException;

public class Synthesizer extends Instrument implements Loadable, Saveable {
    private String waveShape = "sine";
    private String effect = "none";


    private List<String> synthesizerData = Files.readAllLines(Paths.get("./data/synthesizerData.txt"));

    public Synthesizer() throws IOException {
        System.out.println("zap zoop synth noises");
        save();
    }


    //MODIFIES: this
    //EFFECTS: changes the waveshape of the synth and saves it
    public void changeWaveShape(String waveShape) throws FileNotFoundException, UnsupportedEncodingException {
        if (waveShape == "sine") {
            this.waveShape = "sine";
            save();
        } else if (waveShape == "saw") {
            this.waveShape = "saw";
            save();
        } else if (waveShape == "square") {
            this.waveShape = "square";
            save();
        }
    }


    //MODIFIES: this
    //EFFECTS: changes the effects applied to the synth wave and saves it
    public void changeEffect(String effect) throws FileNotFoundException, UnsupportedEncodingException {
        if (effect == "none") {
            this.effect = "none";
            save();
        } else if (effect == "reverb") {
            this.effect = "reverb";
            save();
        } else if (effect == "delay") {
            this.effect = "delay";
            save();
        }
    }


    //EFFECTS: pulls in data from save file and sets the values in their appropriate fields
    @Override
    public void load() {
        this.waveShape = (synthesizerData.get(0));
        this.effect = (synthesizerData.get(1));
    }

    //MODIFIES: ./data/synthesizerData.txt
    //EFFECTS: saves waveShape to index 0, effect to index 1
    @Override
    public void save() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("./data/synthesizerData.txt", "UTF-8");
        writer.println(this.waveShape);
        writer.println(this.effect);
        writer.close();
    }

    public void setWaveShape(String waveShape) {
        this.waveShape = waveShape;
    }

    public String getWaveShape() {
        return waveShape;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }
}
