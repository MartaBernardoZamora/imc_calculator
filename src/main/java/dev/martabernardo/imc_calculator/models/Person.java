package dev.martabernardo.imc_calculator.models;

public class Person {
    private Float weight;
    private Float height;

    public Person(Float weight, Float height) {
        this.weight = weight;
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public Float getHeight() {
        return height;
    }

    public Float calculateIMC() {
        Float imc = weight / (height * height);
        return Math.round(imc * (float) 100) / (float) 100;
    }

}
