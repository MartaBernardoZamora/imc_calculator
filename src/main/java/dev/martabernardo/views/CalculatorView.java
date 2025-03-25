package dev.martabernardo.views;

import java.util.Scanner;

import dev.martabernardo.controller.PersonController;

public class CalculatorView {
    private Scanner scanner;
    private PersonController controller;

    public CalculatorView(Scanner scanner, PersonController controller) {
        this.scanner = scanner;
        this.controller = controller;
    }

    public void printResultMessage(Double imc, String string) {
    }

    public void initMessage() {
        System.out.println("Bienvenido a la calculadora de IMC");        
        System.out.println("Ingrese la altura en metros:");
        String height = scanner.next();        
        System.out.println("Ingrese el peso en kg:");
        String weight = scanner.next();
        System.out.println("Ha ingresado una algura de " + height + " metros y un peso de " + weight + " kg");
        controller.requestIMC(height, weight);
    }

}
