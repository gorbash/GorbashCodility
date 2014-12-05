package com.gorbash.sorting;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-05.
 */
public class NumberOfDiscInsertionsTest {

    private NumberOfDiscInsertions obj = new NumberOfDiscInsertions();


    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[]{}), is(0));
        assertThat(obj.solution(new int[]{4, 0, 0, 0, 0}), is(4));
        assertThat(obj.solution(new int[]{10, 0, 0, 0, 0}), is(4));
        assertThat(obj.solution(new int[]{3, 0, 0, 0, 0}), is(3));
        assertThat(obj.solution(new int[]{1, 5, 2, 1, 4, 0}), is(11));
        assertThat(obj.solution(new int[]{4, 0, 0, 0}), is(3));

        assertThat(obj.solution(new int[]{100, 100, 100, 100, 100}), is(10));
    }

    @Test
    public void exampleZerosTest() {
        assertThat(obj.solution(new int[]{0, 0, 0, 0, 0, 0}), is(0));
    }


    @Test
    public void exampleLargeTest() {
        int[] largeTable = new int[10000];
        for (int i = 0; i < largeTable.length; i++) {
            largeTable[i] = 100000;
        }

        assertThat(obj.solution(largeTable), is(-1));
    }

    @Test
    public void exampleLargestTest() {
        int[] largestTable = new int[3];
        for (int i = 0; i < largestTable.length; i++) {
            largestTable[i] = 2147483647;
        }

        assertThat(obj.solution(largestTable), is(3));
    }

}
