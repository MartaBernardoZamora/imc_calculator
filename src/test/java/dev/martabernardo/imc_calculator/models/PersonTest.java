package dev.martabernardo.imc_calculator.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PersonTest {
    @Test
    @DisplayName("Test getWeight method")
    void testGetWeight() {
        Float weight = (float) 70.5;
        Person person = new Person(weight);

        Float result = person.getWeight();

        assertThat(result, is(weight));


    }

}
