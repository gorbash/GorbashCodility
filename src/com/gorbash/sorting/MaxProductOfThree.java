package com.gorbash.sorting;

import java.util.Arrays;

/**
 * Created by Gorbash on 2014-11-30.
 * Implementation of Codility MaxProductOfThree.
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);

        int biggestThreeProduct = A[A.length-1]*A[A.length-2]*A[A.length-3];

        int biggestWithNegative = Integer.MIN_VALUE;

        if (A[0] < 0 && A[1] < 0) {
            biggestWithNegative = A[0] * A[1] * A[A.length - 1];
        }

        return biggestThreeProduct < biggestWithNegative ? biggestWithNegative : biggestThreeProduct;
    }

}
