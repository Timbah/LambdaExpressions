package expressions;

import java.util.ArrayList;
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

    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {

        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);

        return result;
    }
}
