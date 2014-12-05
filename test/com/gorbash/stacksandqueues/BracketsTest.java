package com.gorbash.stacksandqueues;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-12-05.
 */
public class BracketsTest {

    private Brackets obj = new Brackets();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(""), is(1));
        assertThat(obj.solution("{[()()]}"), is(1));
        assertThat(obj.solution("{[()()]}{"), is(0));
        assertThat(obj.solution("([)()]"), is(0));
        assertThat(obj.solution("(((("), is(0));
        assertThat(obj.solution(")))"), is(0));
        assertThat(obj.solution("]]]"), is(0));
        assertThat(obj.solution("}}}"), is(0));
    }

    @Test
    public void testLargeString() {
        String testString = "";
        for (int i = 0; i < 25000; i++) {
            testString += "{}()[]{}";
        }
        assertThat(obj.solution(testString), is(1));
    }
}
