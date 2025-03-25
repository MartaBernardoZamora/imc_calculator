package dev.martabernardo.controller;

import dev.martabernardo.models.Person;
import dev.martabernardo.views.CalculatorView;

public class PersonController {

    private CalculatorView calculatorView;
    
    public PersonController(CalculatorView calculatorView) {
        this.calculatorView = calculatorView;
    }

    public void requestIMC(String height, String weight) {
        Person person = new Person(weight, height);
        Double imc = person.calculateImc();
        String category = person.getCategoryByImc();
        calculatorView.printResultMessage(imc, category);

    }

}
