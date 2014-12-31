package com.gorbash.leader;

/**
 * Created by Gorbash on 2014-12-07.
 * Implementation of Codility EquiLeader problem.
 */
public class EquiLeader {

    public int solution(int[] A) {
        int candidate = 0;
        int size = 0;
        for (int el : A) {
            if (size == 0) {
                candidate = el;
                size++;
            } else if (size > 0) {
                if (candidate == el)
                    size++;
                else
                    size--;
            } else {
                throw new RuntimeException("Size is less than 0!");
            }
        }
        if (size <= 0)
            return 0;
        int count = 0;
        for (int el : A) {
            if (el == candidate) {
                count++;
            }
        }
        if (count <= A.length / 2)
            return 0;

        int ret = 0;
        int leftSideCount = 0;
        int rightSideCount = count;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                leftSideCount++;
                rightSideCount--;
            }
            if ((leftSideCount > (i + 1) / 2) && (rightSideCount > (A.length - i - 1) / 2)) {
                ret++;
            }
        }
        return ret;
    }
}
