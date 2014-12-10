package com.gorbash.maxsliceproblem;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-10.
 */
public class MaxSliceSumTest {

    private MaxSliceSum obj = new MaxSliceSum();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[]{-6, -2}), is(-2));
        assertThat(obj.solution(new int[]{3, 2, -6, 4, 0}), is(5));
        assertThat(obj.solution(new int[]{-6, 4, 0, 3}), is(7));

        assertThat(obj.solution(new int[]{-6}), is(-6));

        assertThat(obj.solution(new int[]{0, 0}), is(0));
    }
}
