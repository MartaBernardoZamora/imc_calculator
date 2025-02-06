package dev.martabernardo.imc_calculator.controllers;

import dev.martabernardo.imc_calculator.models.Person;
import dev.martabernardo.imc_calculator.views.ResultView;

public class Controller {

    private ResultView resultView;
    
    public Controller(ResultView resultView) {
        this.resultView = resultView;
    }
    
    public Controller() {
        this.resultView = new ResultView();
    }

    public void requestIMC(Float height, Float weight) {
        Person person = new Person(weight, height);
        Float imc = person.calculateIMC();
        resultView.printResultMessage(imc);
    }

}
