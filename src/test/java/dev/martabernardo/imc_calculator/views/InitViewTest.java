package dev.martabernardo.imc_calculator.views;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class InitViewTest {

    @Test
    @DisplayName("Test print welcome message")
    void testInitViewPrint() {
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextFloat()).thenReturn((float)1.75, (float)70.5);
        
        InitView initView = new InitView(mockScanner);
        initView.printInitMessage();

        Mockito.verify(mockScanner, Mockito.times(2)).nextFloat();


    }
    
}
