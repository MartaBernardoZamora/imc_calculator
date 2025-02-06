package dev.martabernardo.imc_calculator.views;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResultViewTest {

    @Test
    @DisplayName("Test print result message")
    void testResultViewPrint() {
        Float imc = 24.39f;
        ResultView spyResultView = spy(new ResultView());
        
        spyResultView.printResultMessage(imc);

        verify(spyResultView, times(1)).printResultMessage(imc);
    }

}
