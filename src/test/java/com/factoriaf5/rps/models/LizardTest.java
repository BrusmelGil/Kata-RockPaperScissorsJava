package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LizardTest {
    

    @Test
    public void testLizardGetType() {
        Lizard lizard = new Lizard();
        assertEquals("lizard", lizard.getType());
    }
}
