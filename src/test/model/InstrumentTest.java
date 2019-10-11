package model;

//import model.Instrument;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;


public class InstrumentTest {
    Instrument s;
    Instrument p;

    @BeforeEach
    void runBefore() throws IOException {
        s = new Synthesizer();
        p = new Piano();
    }

    @Test
    void octaveChangeSynthesizerTest() {
        assertEquals(0, s.octaveChange(0));
        assertEquals(1, s.octaveChange(1));
        assertEquals(2, s.octaveChange(1));
        assertEquals(-1, s.octaveChange(-3));
        assertEquals(2, s.octaveChange(3));
    }

    @Test
    void octaveChangePianoTest() {
        assertEquals(0, p.octaveChange(0));
        assertEquals(1, p.octaveChange(1));
        assertEquals(2, p.octaveChange(1));
        assertEquals(-1, p.octaveChange(-3));
        assertEquals(2, p.octaveChange(3));
    }

    @Test
    void setInstTypeTest() throws IOException {
        assertEquals("none", p.instType);
        p.setInstType("piano");
        assertEquals("piano", p.instType);
        p.setInstType("synthesizer");
        assertEquals("synthesizer", p.instType);



    }



}
