import com.gorbash.FrogRiverOne;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-16.
 */
public class FrogRiverOneTest {

    private FrogRiverOne obj = new FrogRiverOne();

    @Test
    public void example() {
        assertThat(obj.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}), is(6));
    }

    @Test
    public void noWay() {
        assertThat(obj.solution(5, new int[]{1, 2, 3, 4, 1, 2, 3, 4}), is(-1));
    }

    @Test
    public void noWay2() {
        assertThat(obj.solution(5, new int[]{1}), is(-1));
    }


    @Test
    public void simple() {
        assertThat(obj.solution(1, new int[]{1}), is(0));
    }

    @Test
    public void mocking() {
        assertThat(obj.solution(3, new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 3}), is(10));
    }

    @Test
    public void largeTest() {
        int[] example = new int[100000];

        for (int i = 0; i < example.length; i++) {
            example[i] = 1;
        }
        example[example.length - 1] = 2;

        assertThat(obj.solution(2, example), is(99999));
    }
}
