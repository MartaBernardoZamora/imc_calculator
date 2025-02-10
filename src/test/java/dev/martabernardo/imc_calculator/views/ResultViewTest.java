package dev.martabernardo.imc_calculator.views;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
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
    @Test
    @DisplayName("test getIMCCategory")
    void testGetIMCCategory(){
        Float[] imcs = {12.0f, 16.9f, 18.4f,24.9f, 29.9f, 34.9f, 39.9f, 45.0f};
        String[] imcCategories = {"Delgadez severa", "Delgadez moderada", "Delgadez leve", "Peso normal", "Sobrepeso", "Obesidad leve", "Obesidad moderada", "Obesidad mórbida"};
        int i=0;
        for(Float imc: imcs){
            ResultView resultView = new ResultView();
            String result = resultView.getIMCCategory(imc);
            String resultEx = imcCategories[i];

            assertThat(result, is(resultEx));
            i++;
        }
    }

}
