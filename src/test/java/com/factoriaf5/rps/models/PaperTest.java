package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PaperTest {

    @Test
    public void testPaper() {

        Paper paper = new Paper();

        // el uso del Operador instanceof devuelve tru si el objeto es una instancia del tipo especificado o una subclase de ese tipo. 
        //Devuelve false si el objeto no es una instancia del tipo especificado.

        assertTrue(paper instanceof Paper); 
        
        
        assertEquals("Rock", paper.getType());
    
    }
    
    
} 

