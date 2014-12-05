package com.gorbash.sorting;

import java.util.Arrays;

/**
 * Created by Gorbash on 2014-12-05.
 */
public class NumberOfDiscInsertions {
    public int solution(int[] A) {

        long[] starts = new long[A.length];
        long[] ends = new long[A.length];

        for (int i = 0; i < A.length; i++) {
            starts[i] = (long) i - A[i];
            ends[i] = (long) i + A[i];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        long ret = 0;
        long started = 0;
        for (int i = 0, j = 0; i < A.length; ) {
            if (starts[i] <= ends[j]) {
                ret += started;
                if (ret > 10000000)
                    return -1;
                started++;
                i++;
            } else {
                started--;
                j++;
            }
        }

        return (int) ret;
    }
}
