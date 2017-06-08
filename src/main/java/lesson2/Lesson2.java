package lesson2;

import java.util.Collections;
import java.util.function.Function;
import function.Function2;

/**
 * Higher Order Functions
 */
public class Lesson2 {

    /**
     * A higher-order function is a function that does at least one of the following:
     * - Take one or more functions as an input
     * - Output a function
     * All other functions are first order functions. [1]
     */
    public static final Function<Void, Void>
        hooray = nothing -> {
            System.out.println("Hooray!");
            return null;
        };

    /**
     * TODO Implement an function that takes a function as its first argument,
     * a number num as its second argument, then executes the passed in function num times.
     *
     *                            /+++ operation ++++\  /+num+\  /++++ result +++++\ */
    public static final Function2<Function<Void, Void>, Integer, Function<Void, Void>>
        repeat = (operation, num) -> v -> {
            for (int i = 0; i < num; i++)
                operation.apply(v);
            return null;
        };

    /**
     * TODO Implement the same but for concatenation
     */
    public static final Function2<Function<String, String>, Integer, Function<String, String>>
        replicateConcat = (func, num) ->
            str -> String.join("", Collections.nCopies(num, func.apply(str)));

}
