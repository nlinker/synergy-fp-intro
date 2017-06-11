package lesson6;

import org.junit.Assert;
import org.junit.Test;

import static lesson6.Lesson6.factorial;
import static lesson6.Lesson6.factorialSelfRef;

public class Lesson6Test {

    @Test
    public void testFactorials() {
        // Assert.assertTrue(factorial.apply(10L) == 2L);
        Assert.assertEquals((long) factorialSelfRef.apply(10L), 3628800L);
        Assert.assertEquals((long) factorial.apply(10L), 3628800L);
    }
}
