package lesson3;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import static lesson3.Lesson3.doubleAll;

public class Lesson3Test {

    @Test
    public void test() {
        final List<Integer> ints = Arrays.asList(1,2,3,4,5);
        final List<Integer> outs = doubleAll.apply(ints);
        final List<Integer> expected = Arrays.asList(2,4,6,8,10);
        Assert.assertEquals(outs, expected);
     }
}
