package com.gorbash.maxsliceproblem;

import static java.lang.Math.max;
/**
 * Created by Gorbash on 2014-12-10.
 */
public class MaxSliceSum {
    public int solution(int[] A) {

        if (A.length == 0)
            return 0;
        if (A.length == 1)
            return A[0];

        int maxEnding = 0;
        int maxSlice = 0;

        for (int i = 0; i < A.length; i++) {
            maxEnding = max(0, maxEnding + A[i]);
            maxSlice = max(maxSlice, maxEnding);
        }

        int ret = maxSlice;
        if (maxSlice == 0) {
            int maxNegative = Integer.MIN_VALUE;
            for (int i = 0; i < A.length; i++) {
                maxNegative = max(maxNegative, A[i]);
            }
            ret = maxNegative;
        }

        return ret;
    }
}
