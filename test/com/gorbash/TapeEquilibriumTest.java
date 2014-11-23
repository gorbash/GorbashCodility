package com.gorbash;

import com.gorbash.timecomplexity.TapeEquilibrium;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-15.
 */
public class TapeEquilibriumTest {

    private TapeEquilibrium testObject = new TapeEquilibrium();


    @Test
    public void testSmallestExample() {
        assertThat(testObject.solution(new int[]{3, 1}), is(2));

    }

    @Test
    public void testExample() {
        assertThat(testObject.solution(new int[]{3, 1, 2, 4, 3}), is(1));
    }


    @Test
    public void testZeros() {
        assertThat(testObject.solution(new int[]{0, 0, 0, 0, 0}), is(0));
    }

    @Test
    public void testNegativeNumbers() {
        assertThat(testObject.solution(new int[]{-4, 6, -2, 1, 10}), is(7));
    }

    @Test
    public void testLarge10000() {
        int[] A = new int[10000];
        final int countOfTrials = 10000;
        long sumTime = 0;
        for (int i = 0; i < countOfTrials; i++) {
            long start = System.nanoTime();
            testObject.solution(A);
            long end = System.nanoTime();
            long diff = end - start;
            sumTime += diff;
        }

        System.out.println(String.format("Avarage time of %d trials is %dnanos.", countOfTrials, sumTime/countOfTrials));

    }
}
