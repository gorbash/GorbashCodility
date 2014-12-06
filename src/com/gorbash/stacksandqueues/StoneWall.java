package com.gorbash.stacksandqueues;

import java.util.Stack;

/**
 * Created by Gorbash on 2014-12-06.
 */
public class StoneWall {
    public int solution(int[] H) {
        int ret = 0;
        Stack<Integer> wallStack = new Stack();
        for (int i = 0; i < H.length; i++) {
            int el = H[i];
            if (wallStack.empty()) {
                wallStack.push(el);
                ret++;
            } else {
                if (wallStack.peek() == el) {
                    continue;
                }
                if (wallStack.peek() < el) {
                    wallStack.push(el);
                    ret++;
                } else {
                    while (!wallStack.empty() && wallStack.peek() > el) {
                        wallStack.pop();
                    }
                    if (wallStack.empty()) {
                        wallStack.push(el);
                        ret++;
                    } else {
                        if (wallStack.peek() == el) {
                            continue;
                        }
                        if (wallStack.peek() < el) {
                            wallStack.push(el);
                            ret++;
                        }
                    }
                }
            }
        }

        return ret;
    }
}
