package com.gorbash.stacksandqueues;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-06.
 */
public class StoneWallTest {

    private StoneWall obj = new StoneWall();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}), is(7));
        assertThat(obj.solution(new int[]{4, 2, 3, 7, 5, 4, 1, 2}), is(8));
        assertThat(obj.solution(new int[]{1}), is(1));
        assertThat(obj.solution(new int[]{1, 1}), is(1));
    }


    @Test
    public void largeTest() {
        final int testSize = 100000;
        final int startingElement = 1000000000 - testSize + 1;
        int[] input = new int[testSize];
        for (int i = 0; i < input.length; i++) {
            input[i] = startingElement + i;
        }

        assertThat(obj.solution(input), is(testSize));

    }
}
