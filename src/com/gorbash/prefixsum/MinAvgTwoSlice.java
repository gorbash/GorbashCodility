package com.gorbash.prefixsum;

/**
 * Created by Gorbash on 2014-11-27.
 */
public class MinAvgTwoSlice {

    public int solution(int[] A) {
        float[] sliceAv2 = new float[A.length-1];
        for (int i = 0; i < A.length-1;i++) {
            sliceAv2[i] = (A[i] + A[i+1])/2.0f;
        }
        int smallestIndex = findSmallestIndex(sliceAv2);
        float smallestValue = sliceAv2[smallestIndex];

        for (int i = 0; i < A.length - 2; i++) {
            float avarage3 = (A[i] + A[i+1] + A[i+2])/3.0f;
            if (avarage3 < smallestValue) {
                smallestValue = avarage3;
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private int findSmallestIndex(float[] array) {
        int ret = -1;
        float smallest = Float.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest){
                smallest = array[i];
                ret = i;
            }
        }
        return ret;
    }
}
