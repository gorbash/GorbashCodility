package com.gorbash.stacksandqueues;

import java.util.Stack;

/**
 * Created by Gorbash on 2014-12-06.
 */
public class Fish {

    public int solution(int[] A, int[] B) {
        int ret = 0;

        int lastIndex = A.length - 1;

        Stack<Integer> swimRight = new Stack();
        Stack<Integer> swimLeft = new Stack();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1)
                swimRight.push(i);
        }

        if (swimRight.empty() || swimRight.size() == A.length) {
            return A.length;
        }

        while (!swimRight.empty()) {
            Integer fishRightIndex = swimRight.pop();
            for (int i = lastIndex; i > fishRightIndex; i--) {
                if (B[i] == 0)
                    swimLeft.push(i);
            }
            boolean rightEaten = false;
            while (!swimLeft.empty() && !rightEaten) {
                int fishLeftIndex = swimLeft.peek();
                if (A[fishRightIndex] > A[fishLeftIndex]) {
                    swimLeft.pop();
                } else {
                    rightEaten = true;
                }
            }
            lastIndex = fishRightIndex;
            if (!rightEaten) {
                ret++;

            }
        }

        return ret + swimLeft.size() + lastIndex;
    }
}
