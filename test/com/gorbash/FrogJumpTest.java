package com.gorbash;

import com.gorbash.timecomplexity.FrogJump;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-16.
 */
public class FrogJumpTest {

    private FrogJump obj = new FrogJump();

    @Test
    public void testExample() {
        assertThat(obj.solution(10, 85, 30),is(3));
    }

    @Test
    public void testZero() {
        assertThat(obj.solution(10, 10, 30),is(0));
    }

    @Test
    public void testNormal() {
        assertThat(obj.solution(10, 20, 30),is(1));
    }

    @Test
    public void testStepOne() {
        assertThat(obj.solution(10, 20, 1),is(10));
    }
}
