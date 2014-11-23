package com.gorbash.prefixsum;

/**
 * Created by Gorbash on 2014-11-23.
 */
public class PassingCars {

    public int solution(int[] A) {
        int travellingWest = 0;
        int ret = 0;
        for (int i = A.length - 1; i>=0; i--) {
            if (A[i] == 1) {
                travellingWest++;
            } else {
                ret += travellingWest;
                if (ret > 1000000000)
                    return -1;
            }
        }
        return ret;
    }
}
