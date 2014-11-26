package com.gorbash.prefixsum;

/**
 * Created by Gorbash on 2014-11-26.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int sGreaterThanA = (A/K) * K;
        if (sGreaterThanA < A) {
            sGreaterThanA += K;
        }
        int lLessThanB = (B/K)*K;
        if (sGreaterThanA > lLessThanB) {
            return 0;
        }
        int count = (lLessThanB - sGreaterThanA)/K + 1;
        return count;
    }
}
