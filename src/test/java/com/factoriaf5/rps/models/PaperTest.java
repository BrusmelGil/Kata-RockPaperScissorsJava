package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PaperTest {

    @Test
    public void testPaper() {

        Paper paper = new Paper();


        assertTrue(paper instanceof Paper); 
        assertEquals("Paper", paper.getType());
    
    }
    
    
} 

