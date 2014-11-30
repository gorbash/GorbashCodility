package com.gorbash.sorting;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-30.
 */
public class MaxProductOfThreeTest {

    private MaxProductOfThree object = new MaxProductOfThree();

    @Test
    public void exampleTest() {
        assertThat(object.solution(new int[] {-3, 1, 2, -2, 5, 6}), is(60));
        assertThat(object.solution(new int[] {-3, -2, -1}), is(-6));
        assertThat(object.solution(new int[] {-3, -1, -2}), is(-6));

        assertThat(object.solution(new int[] {10, 20, 1, 3, 4, 5, -100, -50}), is(100000));
    }
}
