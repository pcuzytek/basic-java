package simple_java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingBy {

    public static void main(String[] args) {
        String[] names = {"Mariola", "Magdalena", "Piotr", "Jacek", "Bronisław", "Anna"};

        // eg1
        Map<Character, List<String>> collect = Arrays.stream(names).collect(Collectors.groupingBy(element -> element.charAt(0)));

        collect.forEach((character, strings) -> System.out.println(character + ": " + strings));

        // eg2
        System.out.println("-------------------------------------------");
        Map<Character, String> collect2 = Arrays.stream(names).collect(Collectors.groupingBy(element -> element.charAt(0), Collectors.joining("----", ">", "<")));

        collect2.forEach((character, strings) -> System.out.println(character + ": " + strings));
    }
}
