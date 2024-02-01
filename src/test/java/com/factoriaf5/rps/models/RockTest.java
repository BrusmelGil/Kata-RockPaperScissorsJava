package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RockTest {
    
    @Test
    public void testRock() {

        Rock rock = new Rock();

        assertTrue(rock instanceof Rock);
        assertEquals("Rock", rock.getType());
        

    }
    
}
