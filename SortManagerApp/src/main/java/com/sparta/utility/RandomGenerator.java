package com.sparta.utility;

import java.util.Random;

public class RandomGenerator {
    Random random = new Random();

    //default array generator range - > 0 - 10.000
    public void randomArrayGenerator(int size, int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10000);
        }

    }
}
