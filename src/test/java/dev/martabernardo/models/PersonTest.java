package dev.martabernardo.models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Test getWeight method")
    void testGetWeight() {
        Double weight = 70.5;
        Person person = new Person(weight);

        assertThat(person.getWeight(), is(weight));
    }
    @Test
    @DisplayName("Test getWeight method with ,")
    void testGetWeightWithComma() {
        String weight = "70,5";
        Person person = new Person(weight);

        assertThat(person.getWeight(), is(70.5));
    }
}
