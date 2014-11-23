package com.gorbash.countingelements;

/**
 * Created by Gorbash on 2014-11-22.
 */
public class FindMissingPositiveInteger {
    private int N = 100000;

    public int solution(int[] A) {
        boolean[] checks = new boolean[N];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= N) {
                checks[A[i] - 1] = true;
            }
        }
        for (int i = 0; i < N; i++) {
            if (!checks[i])
                return (i + 1);
        }
        return N+1;
    }
}
