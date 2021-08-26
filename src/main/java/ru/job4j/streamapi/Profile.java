package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Stream;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
