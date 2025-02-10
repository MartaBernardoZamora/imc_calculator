package dev.martabernardo.imc_calculator;

import org.junit.jupiter.api.Test;

import dev.martabernardo.imc_calculator.views.InitView;

import static org.mockito.Mockito.mock;

/*import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;*/
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;


class AppTest {
    /*Test que devuelve el 100 % para estudiar y entender en próximos
     * 
    
    @Test
    @DisplayName("Test App main method by simulating user input")
    void testMainWithSystemIn() {
        String simulatedInput = "1.70\n70.5\n";
        ByteArrayInputStream testInput = new ByteArrayInputStream(simulatedInput.getBytes(StandardCharsets.UTF_8));
        System.setIn(testInput);
        App.main(new String[]{});
        System.setIn(System.in);
    } */
    @Test
    @DisplayName("Test if the printInitMessage method is called")
    void testPrintInitMessage() {
        Scanner scanner = mock(Scanner.class);
        InitView initView = new InitView(scanner);
        initView.printInitMessage();
    }
}
