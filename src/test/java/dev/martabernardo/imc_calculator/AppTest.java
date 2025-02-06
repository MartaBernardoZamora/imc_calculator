package dev.martabernardo.imc_calculator;

import org.junit.jupiter.api.Test;

import dev.martabernardo.imc_calculator.views.InitView;

import static org.mockito.Mockito.mock;

import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;


class AppTest {
    @Test
    @DisplayName("Test if the printInitMessage method is called")
    void testPrintInitMessage() {
        Scanner scanner = mock(Scanner.class);
        InitView initView = new InitView(scanner);
        initView.printInitMessage();
    }
}
