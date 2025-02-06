package dev.martabernardo.imc_calculator.views;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;

public class InitViewTest {

    @Test
    @DisplayName("Test print welcome message")
    void testInitViewPrint() {        
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextFloat()).thenReturn(1.75f).thenReturn(70.0f);
        InitView initView = new InitView(scanner);
        initView.printInitMessage();
        Mockito.verify(scanner, Mockito.times(2)).nextFloat();        
    }
    
}
