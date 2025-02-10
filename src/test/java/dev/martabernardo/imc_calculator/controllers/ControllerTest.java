package dev.martabernardo.imc_calculator.controllers;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ControllerTest {

    @Test
    @DisplayName("Test requestIMC method")
    void testRequestIMC() {
        Controller controller = new Controller();
        
        Float height = 1.70f;
        Float weight = 70.5f;
        Controller controllerSpy = spy(controller);

        controllerSpy.requestIMC(height, weight);
        
        verify(controllerSpy, times(1)).requestIMC(height, weight);


    }

}
