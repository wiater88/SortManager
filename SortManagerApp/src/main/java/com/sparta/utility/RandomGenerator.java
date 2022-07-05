package com.sparta.utility;

import java.util.Random;

public class RandomGenerator {
    Random random = new Random();

    //default array generator range - > 0 - 10.000
    public int[] randomArrayGenerator(int size){
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(1,10000);
        }
        return randomArray;
    }
}
