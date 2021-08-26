package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public static List<Integer> matrixToList(List<List<Integer>> matrix) {
        return matrix.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}
