package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String For Interface";
        System.out.println(sup.get());

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supHash = () -> new HashSet<>(list);
        Set<String> strings = supHash.get();
        for (String s : strings) {
            System.out.println(s);
        }

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(sup.get());

        BiConsumer<String, String> consumerBi = (s, s1) -> System.out.println(s + s1);
        consumerBi.accept(sup.get(), " and Second String");

        BiConsumer<Integer, String> consumerBii = (s, s1) -> System.out.println(s + s1);
        int i = 1;
        for (String s : strings) {
            consumerBii.accept(i++, " is " + s);
        }

        Predicate<String> pred = s -> s.isEmpty();
        System.out.println(pred.test(""));
        System.out.println(pred.test("test"));
    }
}
