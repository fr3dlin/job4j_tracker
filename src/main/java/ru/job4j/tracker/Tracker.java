package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        size++;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public Item[] findByName(String key) {
        Item[] copy = new Item[size];
        int sizeSearch = 0;
        for (Item item: items) {
            if (key.equals(item.getName())) {
                copy[sizeSearch] = item;
                sizeSearch++;
            }
        }
        return Arrays.copyOf(copy, sizeSearch);
    }

    public Item[] findAll() {
        Item[] copy = new Item[size];
        int sizeSearch = 0;
        for (Item item: items) {
                copy[sizeSearch] = item;
                sizeSearch++;
        }
        return copy;
    }

    private int indexOf(int id) {
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                return index;
            }
        }
        return -1;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        item.setId(id);
        items.add(index, item);
        index++;
        items.remove(index);
        return true;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        items.remove(index);
        size--;
        return true;
    }
}