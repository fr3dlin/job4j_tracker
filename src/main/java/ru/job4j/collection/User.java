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
        return username.equals(o.username) ? (age - o.age) : username.compareTo(o.username);
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
