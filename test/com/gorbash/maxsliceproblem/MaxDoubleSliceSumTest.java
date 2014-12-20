package com.gorbash.maxsliceproblem;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-18.
 */
public class MaxDoubleSliceSumTest {

    private MaxDoubleSliceSum obj = new MaxDoubleSliceSum();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}), is(17));
        assertThat(obj.solution(new int[]{1, 2, 3}), is(0));
        assertThat(obj.solution(new int[]{1, -2, 3}), is(0));
        assertThat(obj.solution(new int[]{1, -2, 2, 3}), is(2));

    }
}
