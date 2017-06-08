package lesson1;

import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;
import function.Function2;

/**
 * Hello world
 */
public class Lesson1 {

    /**
     * TODO: Write a function that takes an input string and returns it uppercased.
     */
    public static final Function<String, String> upperCaser = str -> {
        return str.toUpperCase();
        // throw new NoSuchMethodError("upperCaser");
    };

    /**
     * TODO: Write a function that takes a string and number and returns concatenated string
     */
    public static final Function2<String, Integer, String> concatenator = (str, n) -> {
        return String.join("", Collections.nCopies(n, str));
        // throw new NoSuchMethodError("concatenator");
    };

    /**
     * The same, but it is essentially a method
     */
    public static String upperCaser(String str) {
        return upperCaser.apply(str);
    }
}