package com.gorbash;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-23.
 */
public class MaxCounterTest {

    private MaxCounter counter = new MaxCounter();

    @Test
    public void testExample() {
        assertThat(counter.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}), is(new int[]{3, 2, 2, 4, 2}));
        assertThat(counter.solution(3, new int[]{3, 2, 1}), is(new int[]{1, 1, 1}));
        assertThat(counter.solution(3, new int[]{3, 2, 1, 3, 3, 3, 3, 3, 3, 3, 3}), is(new int[]{1, 1, 9}));
        assertThat(counter.solution(3, new int[]{3, 2, 1, 3, 3, 3, 3, 3, 3, 3, 3, 4}), is(new int[]{9, 9, 9}));
        assertThat(counter.solution(3, new int[]{3, 2, 1, 3, 3, 3, 3, 3, 3, 3, 3, 4, 1, 1, 1}), is(new int[]{12, 9, 9}));
        assertThat(counter.solution(3, new int[]{3, 2, 1, 3, 3, 3, 3, 3, 3, 3, 3, 4, 1, 1, 1, 4}), is(new int[]{12, 12, 12}));
    }

    @Test
    public void testMinExample() {
        assertThat(counter.solution(1, new int[]{1, 1, 1, 1, 2}), is(new int[]{4}));
    }


    @Test
    public void testLargestInput() {
        int N = 100000;
        int[] input = new int[N];
        for (int i = 0; i < input.length; i++) {
            input[i] = i+1;
        }

        int[] expectedOutput = new int[N];

        for (int i = 0; i < expectedOutput.length; i++) {
            expectedOutput[i] = 1;
        }

        assertThat(counter.solution(N, input), is(expectedOutput));
    }

    @Test
    public void testLargestInputWithMax() {
        int N = 100000;
        int[] input = new int[N];
        for (int i = 0; i < input.length; i++) {
            input[i] = N+1;
        }

        int[] expectedOutput = new int[N];

        for (int i = 0; i < expectedOutput.length; i++) {
            expectedOutput[i] = 0;
        }

        assertThat(counter.solution(N, input), is(expectedOutput));

    }
}
