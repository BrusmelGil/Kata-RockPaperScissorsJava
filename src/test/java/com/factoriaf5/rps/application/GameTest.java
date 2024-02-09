package com.factoriaf5.rps.application;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Player;

public class GameTest {
    
    @Test
    public void TestSofiaWins() {
        
        Player player1 = new Player();
        Player player2 = new Player();

        Game game = new Game("Sofia", "Camila", "Scissors wins",
        "Rock Wins",
        "Scissors Wins", "paper Wins",
        "Lizard Wins", "Spock Wins", 
        "Scissors Wins", "Lizard Wins", "Paper Wins", 
        "Spock Wins", "Rock Wins");


    }
}
