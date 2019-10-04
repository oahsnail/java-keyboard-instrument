package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.NoSuchFileException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SynthesizerTest {
    private List<String> synthesizerData = Files.readAllLines(Paths.get("./data/synthesizerData.txt"));

    Synthesizer s1 = new Synthesizer();
    Synthesizer s2 = new Synthesizer();

    public SynthesizerTest() throws IOException {
    }


    @Test
    public void testSaveSynth() throws IOException {
        s1.setWaveShape("saw");
        s1.setEffect("reverb");
        s1.save();
        synthesizerData = Files.readAllLines(Paths.get("./data/synthesizerData.txt"));
        assertEquals(synthesizerData.get(0), "saw");
        assertEquals((synthesizerData.get(1)), "reverb");

    }

    @Test
    public void testLoadSynth() throws IOException {
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

}
