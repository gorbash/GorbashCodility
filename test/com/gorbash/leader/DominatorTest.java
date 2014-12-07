package com.gorbash.leader;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Gorbash on 2014-12-07.
 */
public class DominatorTest {

    public Dominator obj = new Dominator();

    @Test
    public void boundries() {
        assertThat(obj.solution(new int[]{}), is(-1));
        assertThat(obj.solution(new int[]{1}), is(0));
    }

    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}), anyOf(equalTo(0), equalTo(2), equalTo(4), equalTo(6), equalTo(7)));
        assertThat(obj.solution(new int[]{3, 4}), is(-1));
        assertThat(obj.solution(new int[]{3, 4, 3}), anyOf(equalTo(0), equalTo(2)));
    }


    @Test
    public void largeTest() {
        final int testSize = 100000;
        int[] input = new int[testSize];

        assertThat(obj.solution(input), is(both(greaterThan(-1)).and(lessThan(testSize))));

        for (int i = 0; i < input.length; i++) {
            input[i] = i;
        }

        assertThat(obj.solution(input), is(-1));

    }


}
