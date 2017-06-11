package lesson6;

import java.util.function.Function;
import function.Function2;

public class Lesson6 {

    public static final Function<Long, Long> factorialSelfRef = n -> {
        if (n == 0L) return 1L;
        else return n * Lesson6.factorialSelfRef.apply(n - 1L);
    };


    /**
     * This definition is related with very interesting
     * topic on combinators and using combinators as building
     * blocks for defining computations.
     *
     * One of definition is below.
     * Another definitions look like:
     * <a href="https://gist.github.com/timyates/11304666">more compact</a>
     * <a href="https://gist.github.com/aruld/3965968">more general</a>
     *
     * And all the topic is related to Y-combinator
     * (http://mvanier.livejournal.com/2897.html)
     */
    public static final Function<Long, Long> factorial = n -> {
        final Self<Long> trampoline = new Self<>((cont, m) -> {
            if (m == 0L)
                return 1L;
            else
                return m * cont.func.apply(cont, m - 1);
        });
        return trampoline.func.apply(trampoline, n);
    };

    public static class Self<T> {
        public final Function2<Self<T>, T, T> func;
        public Self(Function2<Self<T>, T, T> func) {
            this.func = func;
        }
    }

}
