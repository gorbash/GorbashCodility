package com.gorbash;

import com.gorbash.prefixsum.PassingCars;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-23.
 */
public class PassingCarsTest {

    private PassingCars object = new PassingCars();

    @Test
    public void exampleTes() {
        assertThat(object.solution(new int[] {0,1,0,1,1}), is(5));
        assertThat(object.solution(new int[] {0,1}), is(1));
        assertThat(object.solution(new int[] {1,0}), is(0));
        assertThat(object.solution(new int[] {1,0, 0, 1, 1, 0, 1, 0, 1, 0}), is(11));
    }
}
