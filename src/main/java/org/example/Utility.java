package org.example;

import java.util.Random;

public class Utility {
    static public boolean generateProbability(int wantedProbability) {
        if (wantedProbability >= 100) return true;
        if (wantedProbability <= 0) return false;

        int res = new Random().nextInt(100);
        return res >= wantedProbability;
    }

    static public int getRandomNumber(int bound) {
        return new Random().nextInt(bound);
    }

    static public int getRandomNumber(int bound, int currentNumber) {
        int res = new Random().nextInt(bound);
        while (res != currentNumber) {
            res = new Random().nextInt(bound);
        }
        return res;
    }
}
