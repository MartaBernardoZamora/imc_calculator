package dev.martabernardo.imc_calculator.views;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResultViewTest {

    @Test
    @DisplayName("Test print result message")
    void testResultViewPrint() {
        Float imc = 24.39f;
        ResultView resultView = new ResultView();
        
        resultView.printResultMessage(imc);

        verify(resultView, times(1)).printResultMessage(imc);
    }

}
