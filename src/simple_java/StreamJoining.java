package simple_java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamJoining {

    public static void main(String[] args) {
        String[] names = {"Mariola", "Magdalena", "Piotr", "Jacek", "Bronisław", "Anna"};

        String collect = Arrays.stream(names)
                .collect(Collectors.joining(" | ", "START: ", " :END"));

        System.out.println(collect);
    }
}
