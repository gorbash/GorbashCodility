package com.gorbash;

/**
 * Created by Gorbash on 2014-11-16.
 */
public class PermCheck {

    public int solution(int[] A) {
        int maxN = 100000;
        boolean[] checkTable = new boolean[maxN];

        for (int i = 0; i < A.length; i++) {

            if (A[i] > maxN)
                return 0;

            int index = A[i] - 1;
            if (!checkTable[index]) {
                checkTable[index] = true;
            } else {
                return 0;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (!checkTable[i])
                return 0;
        }

        return 1;
    }

}
