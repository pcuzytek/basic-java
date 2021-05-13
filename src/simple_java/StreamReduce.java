package simple_java;

import java.util.Arrays;

public class StreamReduce {

    public static void main(String[] args) {

        String[] array = {"pioke", "mjoke"};

        // String example
        String result = Arrays.stream(array).reduce("", (actual, element) -> actual + "[" + element + "]");
        System.out.println(result);

        // Integer example
        Integer letterSum = Arrays.stream(array)
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(letterSum);
    }
}
