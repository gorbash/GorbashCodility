package com.gorbash.primeandcompositenumbers;

/**
 * Created by Gorbash on 2014-12-20.
 */
public class MinPerimeterRectangle {
    public int solution(int N) {
        int start = (int) Math.sqrt(N);
        int a = 0;
        for (int i = start; i > 0; i--) {
            if (N % i == 0) {
                a = i;
                break;
            }
        }
        return 2 * (a + N / a);
    }
}
