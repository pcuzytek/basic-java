package simple_java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningBy {

    public static void main(String[] args) {
        String[] names = {"Mariola", "Magdalena", "Piotr", "Jacek", "Bronisław", "Anna"};

        Map<Boolean, List<String>> trueWomenFalseMen = Arrays.stream(names)
                .collect(Collectors.partitioningBy(element -> element.endsWith("a")));

        System.out.println("Women: " + trueWomenFalseMen.get(true));
        System.out.println("Men: " + trueWomenFalseMen.get(false));
    }
}
