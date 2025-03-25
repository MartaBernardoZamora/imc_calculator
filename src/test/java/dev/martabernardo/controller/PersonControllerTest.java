package dev.martabernardo.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.martabernardo.views.CalculatorView;

public class PersonControllerTest {
    @Test
    @DisplayName("Test requestIMC method")
    void testRequestIMC() {
        
        CalculatorView calculatorView = mock(CalculatorView.class);
        PersonController personController = new PersonController(calculatorView);

        String height = "1.70";
        String weight = "70,50";

        personController.requestIMC(height, weight);

        verify(calculatorView, times(1)).printResultMessage(24.39);
    }
    @Test
    @DisplayName("Test requestIMC method whith category")
    void testRequestIMCWithCategory() {
        
        CalculatorView calculatorView = mock(CalculatorView.class);
        PersonController personController = new PersonController(calculatorView);

        String height = "1.70";
        String weight = "70,50";    

        personController.requestIMC(height, weight);

        verify(calculatorView, times(1)).printResultMessage(24.39, "peso normal");
    }

}
