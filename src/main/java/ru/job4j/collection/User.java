package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int compare = username.compareTo(o.username);
        return compare == 0 ? (age - o.age) : compare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age);
    }
}
