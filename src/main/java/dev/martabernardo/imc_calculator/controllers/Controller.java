package dev.martabernardo.imc_calculator.controllers;

import dev.martabernardo.imc_calculator.models.Person;

public class Controller {

    public Float requestIMC(Float height, Float weight) {
        Person person = new Person(weight, height);
        Float imc = person.calculateIMC();
        return imc;
    }

}
