package dev.martabernardo.models;

public class Person {

    private Double weight;

    public Person(String weight) {
        this.weight = weightConverter(weight);
    }

    public Double getWeight() {
        return weight;
    }

    private Double weightConverter(String weight) {
        return Double.parseDouble(weight.replace(",", "."));
    }

}
