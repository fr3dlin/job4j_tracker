package ru.job4j.function;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String first = "First";
        String second = "Second";
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + right + " : " + left);
            return right.compareTo(left);
        };
        Comparator<String> compSize = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        };
        comparator.compare(first, second);
        compSize.compare(first, second);
    }
}
