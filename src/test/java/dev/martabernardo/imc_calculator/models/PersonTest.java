package dev.martabernardo.imc_calculator.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.text.DecimalFormat;

public class PersonTest {
    @Test
    @DisplayName("Test getWeight method")
    void testGetWeight() {
        Float weight = (float) 70.5;
        Person person = new Person(weight, null);

        Float result = person.getWeight();

        assertThat(result, is(weight));

    }
    @Test
    @DisplayName("Test getHeight method")
    void testGetHeight() {
        Float weight = (float) 70.5;
        Float height = (float) 1.70;
        Person person = new Person(weight, height);

        Float result = person.getHeight();

        assertThat(result, is(height));
    }

    @Test
    @DisplayName("Test calculateIMC method")
    void testCalculateIMC() {
        Float weight = (float) 70.5;
        Float height = (float) 1.70;
        Person person = new Person(weight, height);

        Float result = person.calculateIMC();

        assertThat(result, is((float) 24.39));   
    }  

}
