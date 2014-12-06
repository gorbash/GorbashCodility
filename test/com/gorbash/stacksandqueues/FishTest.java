package com.gorbash.stacksandqueues;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-06.
 */
public class FishTest {

    private Fish obj = new Fish();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}), is(2));
        assertThat(obj.solution(new int[]{1, 4, 8, 3, 7, 5, 2, 6}, new int[]{1, 1, 0, 1, 0, 1, 0, 0}), is(3));
        assertThat(obj.solution(new int[]{1, 2}, new int[]{0, 1}), is(2));
        assertThat(obj.solution(new int[]{1}, new int[]{1}), is(1));
        assertThat(obj.solution(new int[]{1}, new int[]{0}), is(1));
        assertThat(obj.solution(new int[]{1, 2, 2, 2}, new int[]{0, 0, 1, 1}), is(4));
        assertThat(obj.solution(new int[]{1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1}), is(5));
        assertThat(obj.solution(new int[]{1, 1, 1, 1, 1}, new int[]{0, 0, 0, 0, 0}), is(5));
    }

}
