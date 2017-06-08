package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import function.Function2;

/**
 * Basic: Filter
 */
public class Lesson4 {

    /**
     * TODO implement the function filter, which
     * 1. takes a function = predicate
     * 2. takes a list
     * 3. returns the list, that contains only those elements with predicate == True
     */
    public static final Function2<Function<String, Boolean>, List<String>, List<String>>
        filter = (f, xs) -> {
            final int n = xs.size();
            final List<String> result = new ArrayList<>(n);
            for (String x : xs) {
                if (f.apply(x)) {
                    result.add(x);
                }
            }
            return result;
        };

    /**
     * getShortMessages takes a list of objects with '.message'
     * properties and returns another list of messages that are less
     * than <= 20 characters long.
     * The function returns a list containing the messages
     * themselves, without their containing object.
     */
    public static final Function<List<String>, List<String>>
        getShortMessages = xs -> filter.apply(x -> x.length() <= 20, xs);;

}
