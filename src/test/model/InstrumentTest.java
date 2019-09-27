package model;

//import model.Instrument;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;


public class InstrumentTest {
    Instrument i;

    @BeforeEach
    void runBefore() {
        i = new Instrument();
    }

    @Test
    void octaveUpTest() {
        assertEquals(0, i.octave);
        assertEquals(1, i.octaveUp());
        assertEquals(2, i.octaveUp());
        assertEquals(2, i.octave);


    }

    @Test
    void octaveDownTest() {
        assertEquals(0, i.octave);
        assertEquals(-1, i.octaveDown());
        assertEquals(-2, i.octaveDown());
        assertEquals(-2, i.octave);
    }



}
