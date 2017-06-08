package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import function.Function2;

/**
 * Basic: Map
 */
public class Lesson3 {
    /**
     * TODO implement this using standard for loop
     */
    public static final Function2<Function<Integer, Integer>, List<Integer>, List<Integer>>
        map = (f, xs) -> {
            final int n = xs.size();
            final List<Integer> result = new ArrayList<>( n );
            for (Integer x : xs) {
                result.add(f.apply(x));
            }
            return result;
            //throw new NoSuchMethodError("mapLoop");
        };

    public static final Function<List<Integer>, List<Integer>>
        doubleAll = xs -> map.apply(x -> x * 2, xs);
}
