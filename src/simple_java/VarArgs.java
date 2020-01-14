package simple_java;

public class VarArgs {

    public static void main(String[] args) {
        String[] emptyArray = {};
        String[] oneElement = {"one"};
        String[] threeElements = {"one", "two", "three"};
        String[] fiveElements = "one,two,three,four,five".split(",");

        System.out.println(isThereThreeStrings(emptyArray));
        System.out.println(isThereThreeStrings(oneElement));
        System.out.println(isThereThreeStrings(threeElements));
        System.out.println(isThereThreeStrings(fiveElements));
    }

    private static boolean isThereThreeStrings(String... actLikeArray) {
        return actLikeArray.length == 3;
    }
}
