package com.factoriaf5.rps.models;

public class Player {


    public Figure choose(String string) {

        if ("Rock".equals(string)) {
            return new Rock();
        }
        if ("Paper".equals(string)) {
            return new Paper();
        }
        if ("Scissors".equals(string)) {
            return new Scissors();
        }
        if ("Lizard".equals(string)) {
            return new Lizard();
        }
        if ("Spock".equals(string)) {
            return new Spock();
        } 
        return null;
    }
    
}

