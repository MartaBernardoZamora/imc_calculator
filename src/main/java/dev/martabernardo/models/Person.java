package dev.martabernardo.models;

public class Person {

    private Double weight;
    private Double height;

    public Person(String weight, String height) {
        this.weight = stringToDouble(weight);
        this.height = stringToDouble(height);
    }

    public Double getWeight() {
        return weight;
    }

    private Double stringToDouble(String input) {
        return Double.parseDouble(input.replace(",", "."));
    }

    public Double getHeight() {
        return height;
    }

    public Double calculateImc() {
        Double imc = Math.round(weight / (height * height) * 100.0) / 100.0;
        return imc;
    }

    public String getCategoryByImc() {
        Double imc = calculateImc();

        if (imc < 25) return CategoryImc.NORMAL.getCategory();
        if (imc < 30) return CategoryImc.SOBREPESO.getCategory();
        if (imc < 35) return CategoryImc.OBESIDAD_LEVE.getCategory();
        if (imc < 40) return CategoryImc.OBESIDAD_MODERADA.getCategory();

        return CategoryImc.OBESIDAD_MORBIDA.getCategory();
    }
}
