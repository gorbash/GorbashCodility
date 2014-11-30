package com.gorbash.prefixsum;

import com.gorbash.prefixsum.MinAvgTwoSlice;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-27.
 */
public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice object = new MinAvgTwoSlice();

    @Test
    public void testExample() {
        assertThat(object.solution(new int[]{4, 2, 2, 5, 1, 5, 8}), is(1));
    }

    @Test
    public void testOtherExample() {
        assertThat(object.solution(new int[]{2, 2, 2, 2, 2, 2, 1}), is(5));
        assertThat(object.solution(new int[]{3, 2, 1}), is(1));
        assertThat(object.solution(new int[]{0, 0, 0}), is(0));
        assertThat(object.solution(new int[]{-10000, -10000, -9999}), is(0));
        assertThat(object.solution(new int[]{-9999, -9999, -10000}), is(1));
        assertThat(object.solution(new int[]{-10000, -10000}), is(0));

        assertThat(object.solution(new int[]{-2, 2, 3, 3, -1, 2, -2}), is(4));

    }

}
