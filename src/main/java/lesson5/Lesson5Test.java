package lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.junit.Assert;
import org.junit.Test;

import static lesson5.Lesson5.*;

public class Lesson5Test {

    @Test
    public void testRecursiveMap() {
        final List<Integer> input = Arrays.asList(3, 2, 1);
        final Function<Integer, Integer> doubleFunc = s -> s * 2;
        final List<Integer> output = map.apply(doubleFunc, input);
        final List<Integer> expected = Arrays.asList(6, 4, 2);
        Assert.assertEquals(output, expected);
    }

    @Test
    public void testRecursiveFilter() {
        final List<String> input = Arrays.asList("abc", "bc", "c");
        final Function<String, Boolean> containsB = s -> s.contains("b");
        final List<String> output = filter.apply(containsB, input);
        final List<String> expected = Arrays.asList("abc", "bc");
        Assert.assertEquals(output, expected);
    }
}
