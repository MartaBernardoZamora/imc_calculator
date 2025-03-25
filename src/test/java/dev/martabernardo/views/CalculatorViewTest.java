package dev.martabernardo.views;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    @Test
    @DisplayName("Test printResultMessage method")
    void testPrintResultMessage() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner scanner = mock(Scanner.class);
        PersonController controller = mock(PersonController.class);
        CalculatorView calculatorView = new CalculatorView(scanner, controller);

        calculatorView.printResultMessage(24.39, "peso normal");

        String output = outContent.toString();
        assertTrue(output.contains("24.39"));
        assertTrue(output.contains("Usted presenta: peso normal"));

    }
}
