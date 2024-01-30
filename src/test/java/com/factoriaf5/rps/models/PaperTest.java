package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PaperTest {

    @Test
    public void testPaper() {

        Paper paper = new Paper();

        assertEquals("Rock", paper.getType());
    
    }
    
    
} 

