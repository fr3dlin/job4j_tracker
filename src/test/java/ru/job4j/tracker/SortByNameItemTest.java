package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortByNameItemTest {
    @Test
    public void sortByName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("A1"));
        tracker.add(new Item("F1"));
        tracker.add(new Item("D1"));
        List<Item> items = tracker.findAll();
        Collections.sort(items, new SortByNameItem());
        List<Item> result = Arrays.asList(
                new Item("A1"),
                new Item("D1"),
                new Item("F1")
        );
        assertThat(result, is(items));
    }

    @Test
    public void sortByNameRevers() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("A1"));
        tracker.add(new Item("F1"));
        tracker.add(new Item("D1"));
        List<Item> items = tracker.findAll();
        Collections.sort(items, new SortByNameItem().reversed());
        List<Item> result = Arrays.asList(
                new Item("F1"),
                new Item("D1"),
                new Item("A1")
        );
        assertThat(result, is(items));
    }
}