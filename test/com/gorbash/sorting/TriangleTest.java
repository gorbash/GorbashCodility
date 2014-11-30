package com.gorbash.sorting;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-30.
 */
public class TriangleTest {
    private Triangle object = new Triangle();


    @Test
    public void exampleTest(){
        assertThat(object.solution(new int[]{2, 1, 2, 2, 2, 3}), is(1));
        assertThat(object.solution(new int[]{10, 2, 5, 1, 8, 20}), is(1));
        assertThat(object.solution(new int[]{10, 50, 5, 1}), is(0));

        assertThat(object.solution(new int[]{}), is(0));
        assertThat(object.solution(new int[]{10}), is(0));
        assertThat(object.solution(new int[]{10, 2}), is(0));
        assertThat(object.solution(new int[]{10, 2 ,1 }), is(0));

        assertThat(object.solution(new int[]{5, 3 , 3}), is(1));

        assertThat(object.solution(new int[]{3, 4, 6}), is(1));

        assertThat(object.solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 5, 3, 3}), is(1));

    }
}
