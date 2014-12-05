package com.gorbash.stacksandqueues;

/**
 * Created by Gorbash on 2014-12-05.
 */
public class Nesting {
    public int solution(String S) {
        int openParentheses = 0;
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case ')':
                    openParentheses--;
                    break;
                case '(':
                    openParentheses++;
                    break;
                default:
                    throw new RuntimeException("Unknown character:" + S.charAt(i));
            }
            if (openParentheses < 0) {
                return 0;
            }
        }
        return openParentheses == 0 ? 1 : 0;
    }
}
