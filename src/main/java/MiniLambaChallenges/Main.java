package MiniLambaChallenges;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
                System.out.println("-".repeat(50));
            }
        };

        Consumer<String> printWordsLambda = (sentence) -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
            System.out.println("-".repeat(50));
        };

        printWords.accept("Let's split this up into an array");
        printWordsLambda.accept("Let's split this up into an array");

        Consumer<String> printWordsForEach = (sentence) -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
            System.out.println("-".repeat(50));
        };

        printWordsForEach.accept("Let's split this up into an array");
    }
}
