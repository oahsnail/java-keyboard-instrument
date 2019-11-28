package tests;

//import model.Instrument;

import model.Instrument;
import model.Piano;
import model.Synthesizer;
import model.exceptions.OctaveOutOfBoundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
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
    void octaveChangeTest() {

        try {
            s.setOctave(3);
            p.setOctave(3);

        } catch (OctaveOutOfBoundsException o){
            fail("exception should not be caught");
        }
        try {
            s.setOctave(-1);
            p.setOctave(-1);
            fail("no exception thrown");
        } catch (OctaveOutOfBoundsException o){
        }

    }

    @Test
    void getOctaveTest() throws OctaveOutOfBoundsException {
        s.setOctave(2);
        p.setOctave(3);
        assertEquals(2, s.getOctave());
        assertEquals(3, p.getOctave());
    }



}
