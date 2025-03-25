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
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner scanner = mock(Scanner.class);
        when(scanner.hasNext()).thenReturn(true, true);
        when(scanner.next()).thenReturn("1.70", "70.50");

        CalculatorView calculatorView = new CalculatorView(scanner);
        calculatorView.initMessage();

        String output = outContent.toString();
        assertTrue(output.contains("Ingrese la altura"));
        assertTrue(output.contains("Ingrese el peso"));

    }
    @Test
    @DisplayName("Test printResultMessage method")
    void testPrintResultMessage() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Scanner scanner = mock(Scanner.class);
        CalculatorView calculatorView = new CalculatorView(scanner);

        calculatorView.printResultMessage(24.39, "peso normal");

        String output = outContent.toString();
        assertTrue(output.contains("24.39"));
        assertTrue(output.contains("Usted presenta: peso normal"));

    }
}
