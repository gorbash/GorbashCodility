package com.gorbash.primeandcompositenumbers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-20.
 */
public class MinPerimeterRectangleTest {

    MinPerimeterRectangle obj = new MinPerimeterRectangle();


    @Test
    public void exampleTest() {
        assertThat(obj.solution(30), is(22));
        assertThat(obj.solution(1), is(4));
        assertThat(obj.solution(36), is(24));
        assertThat(obj.solution(19), is(40));
    }


}
