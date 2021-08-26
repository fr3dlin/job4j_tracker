package ru.job4j.streamapi;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenProfiles() {
        Address address = new Address("Moscow", "Lubyanka", 4, 321);
        Profile profile = new Profile(address);
        List<Profile> profileList = new ArrayList<>();
        profileList.add(profile);
        Profiles prof = new Profiles();
        List<Address> result = prof.collect(profileList);
        List<Address> expected = List.of(address);
        assertThat(result, is(expected));
    }
}