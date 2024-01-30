package com.factoriaf5.rps.application;

public class Game {

    String player1;
    String player2;
    String scissorsVsPaper;
    String scissorsVsRock;
    String paperVsScissors;
    String paperVsRock;


    public Game(String player1, String player2, String scissorsVsPaper, String scissorsVsRock, String paperVsScissors,
            String paperVsRock) {
        this.player1 = player1;
        this.player2 = player2;
        this.scissorsVsPaper = scissorsVsPaper;
        this.scissorsVsRock = scissorsVsRock;
        this.paperVsScissors = paperVsScissors;
        this.paperVsRock = paperVsRock;
    }


    public String getPlayer1() {
        return player1;
    }


    public void setPlayer1(String player1) {
        this.player1 = player1;
    }


    public String getPlayer2() {
        return player2;
    }


    public void setPlayer2(String player2) {
        this.player2 = player2;
    }


    public String getScissorsVsPaper() {
        return scissorsVsPaper;
    }


    public void setScissorsVsPaper(String scissorsVsPaper) {
        this.scissorsVsPaper = scissorsVsPaper;
    }


    public String getScissorsVsRock() {
        return scissorsVsRock;
    }


    public void setScissorsVsRock(String scissorsVsRock) {
        this.scissorsVsRock = scissorsVsRock;
    }


    public String getPaperVsScissors() {
        return paperVsScissors;
    }


    public void setPaperVsScissors(String paperVsScissors) {
        this.paperVsScissors = paperVsScissors;
    }


    public String getPaperVsRock() {
        return paperVsRock;
    }


    public void setPaperVsRock(String paperVsRock) {
        this.paperVsRock = paperVsRock;
    }

    
    
}


