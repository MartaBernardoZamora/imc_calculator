package dev.martabernardo.imc_calculator.views;

import java.util.Scanner;

import dev.martabernardo.imc_calculator.controllers.Controller;

    

public class InitView {

    private Scanner scanner;
    
    public InitView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printInitMessage() {
        System.out.println("Bienvenido a la calculadora de IMC");        
        System.out.println("Ingrese la altura en metros:");
        String alturaStr = scanner.hasNext() ? scanner.next(): "0";
        float altura = Float.parseFloat(alturaStr.replace(",", "."));         
        System.out.println("Ingrese el peso en kg:");
        String pesoStr = scanner.hasNext() ? scanner.next(): "0";
        float peso = Float.parseFloat(pesoStr.replace(",", ".")); 
        System.out.println("Ha ingresado una algura de " + altura + " metros y un peso de " + peso + " kg");
        Controller controller = new Controller();
        controller.requestIMC(altura, peso);
    }
}
