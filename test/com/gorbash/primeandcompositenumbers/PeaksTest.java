package com.gorbash.primeandcompositenumbers;


import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-30.
 * Test Suite for Peaks Codility problem.
 */
public class PeaksTest {

    private Peaks obj = new Peaks();

    @Test
    public void peakTest() {
        assertThat(obj.peaks(new int[]{}), is(Arrays.asList()));
        assertThat(obj.peaks(new int[]{1}), is(Arrays.asList()));
        assertThat(obj.peaks(new int[]{1, 1}), is(Arrays.asList()));
        assertThat(obj.peaks(new int[]{1, 1, 1}), is(Arrays.asList()));
        assertThat(obj.peaks(new int[]{2, 1, 1}), is(Arrays.asList()));
        assertThat(obj.peaks(new int[]{1, 1, 2}), is(Arrays.asList()));
        assertThat(obj.peaks(new int[]{1, 2, 1}), is(Arrays.asList(1)));
    }

    @Test
    public void divisorTest() {
        assertThat(obj.divisors(12), is(Arrays.asList(12, 6, 4, 3, 2, 1)));
        assertThat(obj.divisors(25), is(Arrays.asList(25, 5, 1)));
    }

    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[]{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), is(1));
        assertThat(obj.solution(new int[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}), is(8));
        assertThat(obj.solution(new int[]{0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0}), is(2));
        assertThat(obj.solution(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}), is(3));
        assertThat(obj.solution(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), is(0));
        assertThat(obj.solution(new int[]{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}), is(2));
        assertThat(obj.solution(new int[]{1}), is(0));
        assertThat(obj.solution(new int[]{1, 2}), is(0));
    }

}
