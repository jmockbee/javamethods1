package com.JonMockbee;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score " + finalScore);
        }

        // just spacing out code getting rid of data types
         gameOver = true;
         score = 1000;
        levelCompleted = 8;
         bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score " + finalScore);
        }
    }
}
