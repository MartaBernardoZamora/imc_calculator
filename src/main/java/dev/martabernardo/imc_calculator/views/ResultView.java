package dev.martabernardo.imc_calculator.views;

public class ResultView {
    private String getIMCCategory(float imc) {
        if (imc < 16) return "Delgadez severa";
        if (imc < 17) return "Delgadez moderada";
        if (imc < 18.5) return "Delgadez leve";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        if (imc < 35) return "Obesidad leve";
        if (imc < 40) return "Obesidad moderada";
        return "Obesidad mórbida";
    }

    public void printResultMessage(float imc) {
        System.out.println("Su índice de masa corporal es: " + imc);
        System.out.println("Usted presenta: " + getIMCCategory(imc));
    }
}
