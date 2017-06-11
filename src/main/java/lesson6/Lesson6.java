package lesson6;

import java.util.function.Function;
import function.Function2;

public class Lesson6 {

    public static final Function<Long, Long> factorialSelfRef = n -> {
        if (n == 0L) return 1L;
        else return n * Lesson6.factorialSelfRef.apply(n - 1L);
    };

    /**
     * TODO: Define function factorial so that its definition DOES NOT refer to
     * Lesson6.factorial.
     *
     * HINT: Employ the data type Self below
     */
    public static final Function<Long, Long> factorial = n -> {
        throw new NoSuchMethodError("factorial");
    };

    public static class Self<T> {
        public final Function2<Self<T>, T, T> func;
        public Self(Function2<Self<T>, T, T> func) {
            this.func = func;
        }
    }

}
