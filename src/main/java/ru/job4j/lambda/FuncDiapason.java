package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuncDiapason {
    public List<Double> diapason(double a, double b, Function<Double, Double> func) {
        List<Double> doubles = new ArrayList<>();
        for (double i = a; i < b; i++) {
            doubles.add(func.apply(i));
        }
        return doubles;
    }
}


