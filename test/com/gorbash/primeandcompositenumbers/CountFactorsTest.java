package com.gorbash.primeandcompositenumbers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Gorbash on 2014-12-21.
 */
public class CountFactorsTest {

    private CountFactors obj = new CountFactors();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(24), is(8));
        assertThat(obj.solution(1), is(1));
        //1, 2, 3, 4, 6, 9, 12, 18, 36
        assertThat(obj.solution(36), is(9));
    }
}
