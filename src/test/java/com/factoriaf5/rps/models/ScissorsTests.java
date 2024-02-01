package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ScissorsTests {

    @Test
    public void testScissors() {

        Scissors scissors = new Scissors();

        assertTrue(scissors instanceof Scissors);
        assertEquals("Scissors", scissors.getType());

        
    }

}
