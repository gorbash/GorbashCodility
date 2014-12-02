package com.gorbash.sorting;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-02.
 */
public class DistinctTest {
    private Distinct object = new Distinct();

    @Test
    public void exampleTest() {
        assertThat(object.solution(new int[]{1, 2, 3}), is(3));

        assertThat(object.solution(new int[]{-21, -21, 21}), is(2));
        assertThat(object.solution(new int[]{}), is(0));
		 assertThat(object.solution(new int[]{}), is(1, 1, 1));
    }
}

