package com.gorbash.prefixsum;

import com.gorbash.prefixsum.CountDiv;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-26.
 */
public class CountDivTest {


    private CountDiv object = new CountDiv();

    @Test
    public void testExample2() {
        assertThat(object.solution(6, 12, 2), is(4));
        assertThat(object.solution(6, 11, 2), is(3));
        assertThat(object.solution(6, 6, 2), is(1));
        assertThat(object.solution(6, 7, 2), is(1));
        assertThat(object.solution(6, 8, 2), is(2));
        assertThat(object.solution(7, 7, 2), is(0));
    }

    @Test
    public void testExample0() {
        assertThat(object.solution(0, 0, 4), is(1));

    }

    @Test
    public void testExample3() {
        assertThat(object.solution(1, 1, 3), is(0));
        assertThat(object.solution(1, 2, 3), is(0));
        assertThat(object.solution(1, 3, 3), is(1));
        assertThat(object.solution(1, 4, 3), is(1));
        assertThat(object.solution(1, 5, 3), is(1));
        assertThat(object.solution(1, 6, 3), is(2));
        assertThat(object.solution(1, 7, 3), is(2));
    }

    @Test
    public void testExample300000() {
        assertThat(object.solution(299999, 300001, 300000), is(1));
        assertThat(object.solution(299997, 299999, 300000), is(0));

    }

    @Test
    public void testExample2000000000() {
        assertThat(object.solution(0, 2000000000, 2), is(1000000001));
        assertThat(object.solution(0, 2000000000, 2000000000), is(2));
        assertThat(object.solution(0, 2000000000, 1), is(2000000001));
    }
}
