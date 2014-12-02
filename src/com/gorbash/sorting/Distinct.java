package com.gorbash.sorting;

import java.util.Arrays;

/**
 * Created by Gorbash on 2014-12-02.
 */
public class Distinct {
    public int solution(int[] A) {
        if (A.length == 0)
            return 0;
        Arrays.sort(A);
        int distinct = 1;
        int last = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] != last) {
                distinct++;
                last = A[i];
            }

        }
        return distinct;
    }
}
