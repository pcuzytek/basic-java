package simple_java;

import java.util.Arrays;

public class StreamReduce {

    public static void main(String[] args) {

        String[] array = {"pioke", "mjoke"};

        // String example
        String stringResult = Arrays.stream(array)
                .reduce("", (actual, element) -> actual + "[" + element + "]");

        System.out.println(stringResult);

        // Integer example
        Integer integerResult = Arrays.stream(array)
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(integerResult);
    }
}
