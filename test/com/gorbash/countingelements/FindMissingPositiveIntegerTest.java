package com.gorbash.countingelements;

import com.gorbash.countingelements.FindMissingPositiveInteger;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-22.
 */
public class FindMissingPositiveIntegerTest {

    private FindMissingPositiveInteger object = new FindMissingPositiveInteger();

    @Test
         public void exampleTest() {
        assertThat(object.solution(new int[] {1, 3, 6, 4, 1, 2}), is(5));
    }


    @Test
     public void example2() {
        assertThat(object.solution(new int[] {1}), is(2));
    }

    @Test
    public void example1() {
        assertThat(object.solution(new int[] {2}), is(1));
    }

    @Test
    public void example211() {
        assertThat(object.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), is(11));
    }


    @Test
    public void exampleminuslarge() {
        assertThat(object.solution(new int[] {-2147483648, 2147483647}), is(1));
    }

    @Test
    public void exampleminus1() {
        assertThat(object.solution(new int[] {-2, 2, 3, 4, 5, 6, 7, 8, 9, 10}), is(1));
    }


    @Test
    public void examplelargest() {
        int[] input = new int[100000];
        for (int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }
        assertThat(object.solution(input), is(100001));
    }
}
