package com.gorbash.leader;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-07.
 */
public class EquiLeaderTest {

    private EquiLeader obj = new EquiLeader();

    @Test
    public void testExample() {
        assertThat(obj.solution(new int[]{4, 3, 4, 4, 4, 2}), is(2));
        assertThat(obj.solution(new int[]{4}), is(0));
        assertThat(obj.solution(new int[]{4, 4}), is(1));
        assertThat(obj.solution(new int[]{4, 4, 4}), is(2));
        assertThat(obj.solution(new int[]{4, 4, 4, 4}), is(3));
        assertThat(obj.solution(new int[]{4, 1, 4, 1, 4, 1}), is(0));

    }
}
