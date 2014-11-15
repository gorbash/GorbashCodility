package com.gorbash;

public class TapeEquilibrium {

    public int solution(int[] A) {
        int ret = Integer.MAX_VALUE;
        int rightSide = 0;
        int previousP = 0;
        for (int p = 1; p < A.length; p++) {
            int leftSide = A[p - 1];
            if (p == 1) {
                for (int i = p; i < A.length; i++) {
                    rightSide += A[i];
                }
            } else {
                rightSide -= previousP;
            }
            previousP = A[p];
            A[p] = leftSide + A[p];
            int distance = Math.abs(leftSide - rightSide);
            if (ret > distance) {
                ret = distance;
            }
        }
        return ret;
    }

}