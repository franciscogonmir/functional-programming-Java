package com.functional.Programing;

import java.util.function.BiFunction;

public class charter3Video3 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (num1, num2) -> num1 + num2;
        TriFunction<Integer, Integer, Integer, Integer> sumThreeElement = (num1, num2, num3) -> num1 + num2 + num3;
        NoArgumentsFunction<String> string = () -> "Hello functional programing";
        System.out.println(suma.apply(5, 5));
        System.out.println(sumThreeElement.apply(5, 5, 5));
        System.out.println(string.apply());
    }
}
