package com.gorbash.stacksandqueues;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-05.
 */
public class NestingTest {
    private Nesting obj = new Nesting();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(""), is(1));
        assertThat(obj.solution("(((("), is(0));
        assertThat(obj.solution(")))"), is(0));
        assertThat(obj.solution(")("), is(0));
        assertThat(obj.solution("()"), is(1));

        assertThat(obj.solution("(()(())())"), is(1));
        assertThat(obj.solution("())"), is(0));
    }

    @Test
    public void testLargeString() {
        StringBuffer testString = new StringBuffer();
        for (int i = 0; i < 500000; i++) {
            testString.append("()");
        }
        assertThat(obj.solution(testString.toString()), is(1));
    }
}
