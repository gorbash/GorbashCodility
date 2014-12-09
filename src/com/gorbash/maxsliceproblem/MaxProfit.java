package com.gorbash.maxsliceproblem;

import static java.lang.Math.max;

/**
 * Created by Gorbash on 2014-12-09.
 */
public class MaxProfit {
    public int solution(int[] A) {

        if (A.length <= 1)
            return 0;

        int maxEnding = 0;
        int maxSlice = 0;

        int[] profits = new int[A.length - 1];

        for (int i = 1; i < A.length; i++) {
            profits[i - 1] = A[i] - A[i - 1];
        }

        for (int i = 0; i < profits.length; i++) {
            maxEnding = max(0, maxEnding + profits[i]);
            maxSlice = max(maxSlice, maxEnding);
        }

        return maxSlice;
    }
}
