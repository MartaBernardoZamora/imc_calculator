package dev.martabernardo.views;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import java.util.Scanner;
import dev.martabernardo.controller.PersonController;

import org.junit.jupiter.api.DisplayName;

public class CalculatorViewTest {
    @Test
    @DisplayName("Test initMessage method")
    void testInitMessage() {
        Scanner scanner = mock(Scanner.class);
        PersonController controller = mock(PersonController.class);

        CalculatorView calculatorView = new CalculatorView(scanner, controller);

        when(scanner.hasNext()).thenReturn(true, true);
        when(scanner.next()).thenReturn("1.70", "70.50");
 
        calculatorView.initMessage();
        verify(controller).requestIMC("1.70", "70.50");
    }
}
