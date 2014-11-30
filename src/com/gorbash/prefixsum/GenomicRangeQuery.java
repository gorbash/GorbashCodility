package com.gorbash.prefixsum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gorbash on 2014-11-29.
 */
public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        int[][] input = getInputInInts(S);
        int[] ret = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            if (P[i] == Q[i]) {
                char atI = S.charAt(P[i]);
                ret[i] = mapCharToValue(atI);
            } else {
                ret[i] = getMin(P[i], Q[i], input);
            }

        }
        return ret;
    }



    private int getMin(int start, int end, int[][] input) {
        if (start == 0) {
            if (input[end][0] > 0) {
                return 1;
            } else if (input[end][1] > 0) {
                return 2;
            } else if (input[end][2] > 0) {
                return 3;
            } else  if (input[end][3] > 0) {
                return 4;
            }

        }

        if (input[end][0] - input[start-1][0] > 0) {
            return 1;
        } else if (input[end][1] - input[start-1][1] > 0) {
            return 2;
        } else if (input[end][2] - input[start-1][2] > 0) {
            return 3;
        } else if (input[end][3] - input[start-1][3] > 0) {
            return 4;
        }
        throw new RuntimeException("Don't know!");
    }

    public int mapCharToValue(char ch) {
        int ret = 0;
        switch (ch) {
            case 'A':ret = 1;break;
            case 'C':ret = 2;break;
            case 'G':ret = 3;break;
            case 'T':ret = 4;break;
            default: throw new RuntimeException("Unknown character " + ch);
        }
        return ret;
    }

    private int[][] getInputInInts(String S) {
        int[][] ret = new int[S.length()][4];
        int i = 0;
        for (char ch:S.toCharArray()) {
            if (i > 0) {
                ret[i][0] = ret[i-1][0];
                ret[i][1] = ret[i-1][1];
                ret[i][2] = ret[i-1][2];
                ret[i][3] = ret[i-1][3];
            }
            ret[i][mapCharToValue(ch)-1]++;
            i++;
        }
        return ret;
    }
}
