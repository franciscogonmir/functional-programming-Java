package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Chapter3Video4 {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        Map<Boolean, List<String>> wordLengthMap = words
                .stream()
                .collect(Collectors.partitioningBy(
                        (word) -> word.length() > 5
                ));

        System.out.println(wordLengthMap);
    }
}
