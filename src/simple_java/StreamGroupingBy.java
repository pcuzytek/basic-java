package simple_java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamGroupingBy {

    public static void main(String[] args) {
        String[] names = {"Mariola", "Magdalena", "Piotr", "Jacek", "Bronisław", "Anna"};

        // eg1
        Arrays.stream(names)
                .collect(Collectors.groupingBy(element -> element.charAt(0)))
                .forEach((character, strings) -> System.out.println(character + ": " + strings));

        // eg2
        System.out.println("-------------------------------------------");
        Arrays.stream(names)
                .collect(Collectors.groupingBy(element -> element.charAt(0), Collectors.joining(", ", ">", "<")))
                .forEach((character, strings) -> System.out.println(character + ": " + strings));
    }
}
