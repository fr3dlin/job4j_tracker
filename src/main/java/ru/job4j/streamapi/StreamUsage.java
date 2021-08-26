package ru.job4j.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, -4, 3, -10, 53, 67, -41));
        List<Integer> stream = list.stream().filter(x -> x > 0).collect(Collectors.toList());
        stream.forEach(System.out::println);
    }
}
