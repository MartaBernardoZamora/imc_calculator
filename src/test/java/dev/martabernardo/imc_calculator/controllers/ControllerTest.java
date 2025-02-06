package dev.martabernardo.imc_calculator.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    @DisplayName("Test receiving height and weight")
    void testGetUserData() {
        Float height = (float)1.70;
        Float weight = (float)70.5;
        Controller controller = new Controller();
        Float result = controller.requestIMC(height, weight);
        assertThat(result, is((float) 24.39));
    }
}
