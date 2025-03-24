package dev.martabernardo.models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    @DisplayName("Test getWeight method")
    void testGetWeight() {
        String weight = "70.5";
        Person person = new Person(weight, "1.70");

        assertThat(person.getWeight(), is(70.5));
    }
    @Test
    @DisplayName("Test getWeight method with ,")
    void testGetWeightWithComma() {
        String weight = "70,5";
        Person person = new Person(weight, "1.70");

        assertThat(person.getWeight(), is(70.5));
    }
    @Test
    @DisplayName("Test getHeight method")
    void testGetHeight() {
        String weight = "70.5";
        String height = "1.70";
        Person person = new Person(weight, height);

        assertThat(person.getHeight(), is(1.70));
    }
}
