package com.gorbash.sorting;

import java.util.Arrays;

/**
 * Created by Gorbash on 2014-11-30.
 */
public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);


        for (int i = 0; i < A.length - 2; i++) {
            if (checkTriple(A[i], A[i+1], A[i+2])) {
                return 1;
            }
        }
        return 0;
    }

    private boolean checkTriple(int a, int b, int c) {

        long la = a;
        long lb = b;
        long lc = c;
        long ab = la+lb;
        long ac = la+lc;
        long bc = lb+lc;

        if (ab<=c)
            return false;
        if (ac<=b)
            return false;
        if (bc<=a)
            return false;
        return true;
    }
}
