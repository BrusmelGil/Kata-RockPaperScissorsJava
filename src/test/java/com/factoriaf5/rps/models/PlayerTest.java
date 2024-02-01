package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlayerTest {

    private Player player1;
    private Player player2;
    
    public PlayerTest() {
        this.player1= new Player();
        this.player2= new Player();
    }

    @Test
    public void Testplayer1ChooseRock() {
        Figure rock = player1.choose("Rock");
        assertTrue(rock instanceof Rock);
        assertEquals("Rock", rock.getType());
    }

    @Test
    public void Testplayer2ChooseRock() {
        Figure rock = player2.choose("Rock");
        assertTrue(rock instanceof Rock);
        assertEquals("Rock", rock.getType());
    }

    @Test
    public void Testplayer1ChoosePaper() {
        Figure paper = player1.choose("Paper");
        assertTrue(paper instanceof Paper);
        assertEquals("Paper", paper.getType());
    }

    @Test
    public void Testplayer2ChoosePaper() {
        Figure paper = player2.choose("Paper");
        assertTrue(paper instanceof Paper);
        assertEquals("Paper", paper.getType());
    }
    
    @Test
    public void Testplayer1ChooseScissors() {
        Figure scissors = player1.choose("Scissors");
        assertTrue(scissors instanceof Scissors);
        assertEquals("Scissors", scissors.getType());
    }

    @Test
    public void Testplayer2ChooseScissors() {
        Figure scissors = player2.choose("Scissors");
        assertTrue(scissors instanceof Scissors);
        assertEquals("Scissors", scissors.getType());
    }


}
