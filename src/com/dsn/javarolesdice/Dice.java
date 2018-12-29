package com.dsn.javarolesdice;
import java.util.Random;
public class Dice {

    Random numberDice;

    private int myPhone;

    public Dice(){
        numberDice = new Random();
    }

    public int showRandomNumber(){
        int currentRoll = numberDice.nextInt(6) + 1;
        return currentRoll;
    }
}
