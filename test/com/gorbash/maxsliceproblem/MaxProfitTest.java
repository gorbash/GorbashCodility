package com.gorbash.maxsliceproblem;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-09.
 */
public class MaxProfitTest {

    private MaxProfit obj = new MaxProfit();

    @Test
    public void testExample() {
        assertThat(obj.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}), is(356));
        assertThat(obj.solution(new int[]{23171}), is(0));
        assertThat(obj.solution(new int[]{2, 3}), is(1));
        assertThat(obj.solution(new int[]{3, 2}), is(0));
        assertThat(obj.solution(new int[]{}), is(0));
    }
}
