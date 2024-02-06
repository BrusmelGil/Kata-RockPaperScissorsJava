package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpockTest {
    

    @Test
    public void testSpockGetType() {
        Spock spock = new Spock();
        assertEquals("spock", spock.getType());
    }
}
