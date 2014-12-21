package com.gorbash.primeandcompositenumbers;

/**
 * Created by Gorbash on 2014-12-21.
 */
public class CountFactors {
    public int solution(int N) {

        int ret = 0;
        int s = (int) Math.sqrt(N);
        for (int i = 1; i <= s; i++) {
            if (N % i == 0)
                ret++;
        }
        ret = ret * 2;
        if (s * s == N)
            ret--;
        return ret;
    }
}
