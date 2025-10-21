package expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "Alpha", "bravo", "charlie", "delta"));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("_".repeat(30));

        list.forEach((myString) -> System.out.println(myString));

        System.out.println("_".repeat(30));

        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(myString + " means " + first);
        });

        int result = calculator((a, b) -> a + b, 0, 0);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.0);
        var result3 = calculator(
                (a, b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ralph", "Kramden");

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("-".repeat(30));
        list.forEach(s -> System.out.println(s));

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.fill(emptyStrings, "");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + ".");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, (i) -> "" + (i + 1) + "."
                + switch (i) {
            case 0 -> "One";
            case 1 -> "Two";
            case 2 -> "Three";
            default -> "";
        });

        System.out.println(Arrays.toString(emptyStrings));

    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {

        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);

        return result;
    }

    //THere are many built in interfaces in java.util package
    // Four categories are Consumer(Don't return anything),
    // Predicate(always return a boolean)


}
