package com.gorbash;

/**
 * Created by Gorbash on 2014-11-16.
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        boolean[] leafs = new boolean[X];
        int lastUpdatedIndex = -1;
        for (int i = 0; i < A.length; i++) {
            int index = A[i] - 1;
            if (index < leafs.length) {
                if (!leafs[index]) {
                    leafs[index] = true;
                    lastUpdatedIndex = i;
                }
            }
        }

        for (int i = 0; i < leafs.length; i++ ) {
            if (!leafs[i])
                return -1;
        }


        return lastUpdatedIndex;
    }
}
