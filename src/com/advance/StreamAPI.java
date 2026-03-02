package com.advance;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("mango", "apple", "mango", "grape", "Grape", "kiwi", "pineapple");

        List<Integer> numbers = Arrays.asList(7, 9, 3, 45, 98, 7, 4, 5, 8, 12, 58, 74);

        // 1. Find and print all unique words (case-insensitive)
        words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x -> x, Collectors.counting())).forEach((word, count) -> {
            if (count == 1) {
                System.out.println(word);
            }
        });


        // 2. Count word frequency (case-insensitive)
        System.out.println(words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x -> x, Collectors.counting())));


        // 3. Convert all words to uppercase
        words.stream().map(String::toUpperCase).forEach(System.out::println);


        // 4. Sort words alphabetically (case-insensitive)
        words.stream().map(String::toLowerCase).sorted().forEach(System.out::println);


        // 5. Sort words by length
        words.stream().map(String::toLowerCase).sorted(Comparator.comparing(String::length)).forEach(System.out::println);


        // 6. Find the longest word
        System.out.println(words.stream().max(Comparator.comparing(String::length)).get());


        // 7. Find the shortest word
        System.out.println(words.stream().min(Comparator.comparing(String::length)).get());


        // 8. Print words starting with 'm' (case-insensitive)
        words.stream().map(String::toLowerCase).filter(x -> x.startsWith("m")).forEach(System.out::println);


        // 9. Print words containing the letter 'a'
        words.stream().map(String::toLowerCase).filter(x -> x.contains("a")).forEach(System.out::println);


        // 10. Join all words with comma
        System.out.println(words.stream().collect(Collectors.joining(",")));


        // 11. Print even numbers
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);


        // 12. Print odd numbers
        numbers.stream().filter(x -> x % 2 != 0).forEach(System.out::println);


        // 13. Find maximum number
        System.out.println(numbers.stream().mapToInt(x -> x).max().getAsInt());


        // 14. Find minimum number
        System.out.println(numbers.stream().mapToInt(x -> x).min().getAsInt());


        // 15. Find sum of numbers
        System.out.println(numbers.stream().mapToInt(x -> x).sum());


        // 16. Find average of numbers
        System.out.println(numbers.stream().mapToInt(x -> x).average().getAsDouble());


        // 17. Remove duplicate numbers
        numbers.stream().distinct().forEach(System.out::println);


        // 18. Sort numbers in ascending order
        numbers.stream().sorted().forEach(System.out::println);


        // 19. Sort numbers in descending order
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        // 20. Count numbers greater than 10
        System.out.println(numbers.stream().filter(x -> x > 10).count());


        // 21. Map each word to its length (case-insensitive)
        System.out.println(words.stream().map(String::toLowerCase).distinct().collect(Collectors.toMap(x -> x, x -> x.length())));


        // 22. Group words by first character
        System.out.println(words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x -> x.charAt(0))));


        // 23. Group words by word length
        System.out.println(words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(String::length)));


        // 24. Count words with more than 5 characters
        System.out.println(words.stream().filter(x -> x.length() > 5).count());


        // 25. Multiply each number by 2
        numbers.stream().map(x -> x * 2).forEach(System.out::println);


        // 26. Filter numbers between 10 and 50 (inclusive)
        numbers.stream().filter(x -> x >= 10 && x <= 50).forEach(System.out::println);


        // 27. Partition numbers into even and odd
        System.out.println(numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));


        // 28. Find the second-largest number
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
