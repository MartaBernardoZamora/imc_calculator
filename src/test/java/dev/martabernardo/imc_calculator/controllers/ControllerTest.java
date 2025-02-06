package dev.martabernardo.imc_calculator.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.martabernardo.imc_calculator.views.ResultView;

public class ControllerTest {

    @Test
    @DisplayName("Test receiving height and weight")
    void testGetUserData() {
        ResultView spyResultView = spy(ResultView.class);

        Float height = 1.70f;
        Float weight = 70.0f;
        Controller controller = new Controller(spyResultView);

        controller.requestIMC(height, weight);

        assertThat(height, is(1.70f));
        assertThat(weight, is(70.0f));
    }
    @Test
    @DisplayName("Test requestIMC method")
    void testRequestIMC() {
        ResultView spyResultView = spy(ResultView.class);
        Controller controller = new Controller(spyResultView);
        
        Float height = 1.70f;
        Float weight = 70.5f;
        controller.requestIMC(height, weight);
        Float imc= 24.39f;

        verify(spyResultView, times(1)).printResultMessage(imc);
    }
}
