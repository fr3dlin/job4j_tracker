package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenProfiles() {
        List<Address> addresses = List.of(
                new Address("Moscow", "Lubyanka", 4, 321),
                new Address("Moscow", "Soltikova", 5, 13),
                new Address("Moscow", "Marksa", 15, 9)
        );
        List<Profile> profileList = new ArrayList<>();
        for (Address address : addresses) {
            profileList.add(new Profile(address));
        }
        Profiles prof = new Profiles();
        List<Address> result = prof.collect(profileList);
        assertThat(result, is(addresses));
    }

    @Test
    public void whenProfilesDistinct() {
        List<Address> addresses = List.of(
                new Address("Moscow", "Lubyanka", 4, 321),
                new Address("Moscow", "Soltikova", 5, 13),
                new Address("Moscow", "Marksa", 15, 9),
                new Address("Moscow", "Lubyanka", 4, 321),
                new Address("Moscow", "Soltikova", 5, 13)
        );
        List<Profile> profileList = new ArrayList<>();
        for (Address address : addresses) {
            profileList.add(new Profile(address));
        }
        Profiles prof = new Profiles();
        List<Address> result = prof.collectSort(profileList);
        List<Address> expected = List.of(
                new Address("Moscow", "Lubyanka", 4, 321),
                new Address("Moscow", "Marksa", 15, 9),
                new Address("Moscow", "Soltikova", 5, 13)
        );

        assertThat(result, is(expected));
    }
}