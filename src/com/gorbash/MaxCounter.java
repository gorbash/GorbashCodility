package com.gorbash;

/**
 * Created by Gorbash on 2014-11-23.
 */
public class MaxCounter {
    public int[] solution(final int N, int[] A) {

        int[] ret = new int[N];
        int maxCounterValue = 0;
        int lastResetValue = 0;
        boolean reset = false;

        for (int i = 0; i < A.length; i++) {
            int operation = A[i];
            if (operation == N + 1){
                reset = true;
                lastResetValue = maxCounterValue;
            } else {
                int counterIndex = operation - 1;
                if (reset){
                    if (ret[counterIndex] < lastResetValue) {
                        ret[counterIndex] = lastResetValue;
                    }
                }
                ret[counterIndex]++;
                if (maxCounterValue < ret[counterIndex]) {
                    maxCounterValue = ret[counterIndex];
                }
            }
        }

        if(reset) {
            for (int i = 0; i < ret.length; i++) {
                if (ret[i] < lastResetValue) {
                    ret[i] = lastResetValue;
                }
            }
        }

        return ret;
    }
}
