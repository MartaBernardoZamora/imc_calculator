package dev.martabernardo.imc_calculator.views;

import java.util.Scanner;

    

public class InitView {

    private Scanner scanner;
    
    public InitView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printInitMessage() {
        System.out.println("Bienvenido a la calculadora de IMC");        
        System.out.println("Ingrese la altura en metros:");
        float altura = scanner.nextFloat();        
        System.out.println("Ingrese el peso en kg:");
        float peso = scanner.nextFloat(); 
        System.out.println("Ha ingresado una algura de " + altura + " metros y un peso de " + peso + " kg");
    }
}
