package com.JonMockbee;

public class Main {

    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }


    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score " + finalScore);
        }


    }
}
