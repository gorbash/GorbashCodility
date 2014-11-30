package com.gorbash.prefixsum;

import com.gorbash.prefixsum.GenomicRangeQuery;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-29.
 */
public class GenomicRangeQueryTest {

    private GenomicRangeQuery object = new GenomicRangeQuery();
    private String longInput;
    private int[] P;
    private int[] Q;
    private int[] answer;

    @Before
    public void setup() {
        StringBuffer longBuf = getStringBuffer(100000);
        longInput = longBuf.toString();

        P = new int[50000];
        Q = new int[50000];
        answer = new int[50000];
        for (int i = 0; i < 50000; i++) {
            Q[i] = 99999;
            answer[i] = 1;
        }
    }

    private StringBuffer getStringBuffer(int size) {
        StringBuffer longBuf = new StringBuffer();
        for (int i = 0; i < size; i++) {
            double rand = Math.random();
            if (rand < 0.25) {
                longBuf.append('A');
            } else if (rand < 0.5) {
                longBuf.append('C');
            } else if (rand < 0.75) {
                longBuf.append('G');
            } else {
                longBuf.append('T');
            }
        }
        return longBuf;
    }

    @Test
    public void exampleTest() {
        assertThat(object.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}), is(new int[]{2, 4, 1}));
        assertThat(object.solution("CCCCCCC", new int[]{2, 5, 0}, new int[]{4, 5, 6}), is(new int[]{2, 2, 2}));
        assertThat(object.solution("T", new int[]{0, 0, 0}, new int[]{0, 0, 0}), is(new int[]{4, 4, 4}));
    }

    @Test
    public void largeTest() {
        assertThat(object.solution(longInput, P, Q), is(answer));
    }

    @Test
    public void strangeTest() {
        assertThat(object.solution("CTTA", new int[]{0}, new int[]{2}), is(new int[]{2}));
        assertThat(object.solution("CTTA", new int[]{0}, new int[]{1}), is(new int[]{2}));
    }


    @Test
    public void randomComparisonTest() {
        for (int iteration = 0; iteration < 100; iteration++) {
            String input = getStringBuffer(100).toString();
            int testSpaceLength = 0;
            for (int i = 0; i <= input.length(); i++) {
                testSpaceLength += i;
            }
            int[] localP = new int[testSpaceLength];
            int[] localQ = new int[testSpaceLength];
            int index = 0;
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j <= i; j++) {
                    localP[index] = j;
                    localQ[index] = i;
                    index++;
                }
            }
            assertThat(String.format("Testing %s with P=%s and Q=%s", input, Arrays.asList(toObject(localP)), Arrays.asList(toObject(localQ))), object.solution(input, localP, localQ), is(solution2(input, localP, localQ)));
        }
    }

    public static Integer[] toObject(int[] intArray) {

        Integer[] result = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = Integer.valueOf(intArray[i]);
        }
        return result;
    }

    public int[] solution2(String S, int[] P, int[] Q) {
        int[] input = new int[S.length()];
        int[] ret = new int[P.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = object.mapCharToValue(S.charAt(i));
        }
        for (int i = 0; i < P.length; i++) {
            int min = 5;
            for (int j = P[i]; j <= Q[i]; j++) {
                if (input[j] < min)
                    min = input[j];
            }
            ret[i] = min;
        }
        return ret;
    }

}
