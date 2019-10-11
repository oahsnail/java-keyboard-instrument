package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.NoSuchFileException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SynthesizerTest {
    private List<String> synthesizerData = Files.readAllLines(Paths.get("./data/synthesizerData.txt"));

    private Synthesizer s1;
    private Synthesizer s2;

    SynthesizerTest() throws IOException {
    }


    @BeforeEach
    void runBefore() throws IOException {
        s1 = new Synthesizer();
        s2 = new Synthesizer();
    }

    @Test
    void saveSynthesizerTest() throws IOException {
        s1.setWaveShape("saw");
        s1.setEffect("reverb");
        s1.save();
        synthesizerData = Files.readAllLines(Paths.get("./data/synthesizerData.txt"));
        assertEquals(synthesizerData.get(0), "saw");
        assertEquals((synthesizerData.get(1)), "reverb");

    }

    @Test
    void loadSynthesizerTest() throws IOException {
        s2.setWaveShape("sine");
        s2.setEffect("reverb");
        s2.save();
        s2.setWaveShape("saw");
        s2.setEffect("delay");
        s2.load();
        synthesizerData = Files.readAllLines(Paths.get("./data/synthesizerData.txt"));
        assertEquals(synthesizerData.get(0), "sine");
        assertEquals(synthesizerData.get(1), "reverb");

    }

    @Test
    void changeWaveShapeTest() throws FileNotFoundException, UnsupportedEncodingException {
        assertEquals("sine", s1.getWaveShape());
        s1.changeWaveShape("saw");
        assertEquals("saw", s1.getWaveShape());
        s1.changeWaveShape("square");
        assertEquals("square", s1.getWaveShape());
        s1.changeWaveShape("sine");
        assertEquals("sine", s1.getWaveShape());

    }

    @Test
    void changeEffectTest() throws FileNotFoundException, UnsupportedEncodingException {
        assertEquals("none", s1.getEffect());
        s1.changeEffect("reverb");
        assertEquals("reverb", s1.getEffect());
        s1.changeEffect("delay");
        assertEquals("delay", s1.getEffect());
        s1.changeEffect("none");
        assertEquals("none", s1.getEffect());

    }


}
