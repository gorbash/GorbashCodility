package com.gorbash.timecomplexity;

/**
 * Created by Gorbash on 2014-11-16.
 */
public class FrogJump {


    public int solution(int X, int Y, int D) {
        int distance = Y-X;
        int countOfJumps = distance/D;
        if (D*countOfJumps < distance)
            countOfJumps++;
        return countOfJumps;
    }
}
