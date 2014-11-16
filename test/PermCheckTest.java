import com.gorbash.PermCheck;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Gorbash on 2014-11-16.
 */
public class PermCheckTest {

    private PermCheck obj = new PermCheck();

    @Test
    public void exampleTest() {
        assertThat(obj.solution(new int[] {4, 1, 3, 2}), is(1) );
    }

    @Test
         public void boundary() {
        assertThat(obj.solution(new int[] {1}), is(1) );
    }

    @Test
    public void boundary2() {
        assertThat(obj.solution(new int[] {2}), is(0) );
    }

    @Test
    public void boundary3() {
        assertThat(obj.solution(new int[] {1, 100000}), is(0) );
    }

    @Test
    public void sameValues() {
        assertThat(obj.solution(new int[] {1, 2, 3, 3}), is(0) );
    }

    @Test
         public void largeValue() {
        assertThat(obj.solution(new int[] {1000000000}), is(0) );
    }


    @Test
    public void largeArray() {
        int[] inputArray = new int[100000];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = i + 1;
        }
        assertThat(obj.solution(inputArray), is(1) );
    }

}
