package dev.martabernardo;

import java.util.Scanner;

import dev.martabernardo.views.CalculatorView;
public final class App {
    private App() {
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        CalculatorView calculatorView = new CalculatorView(scanner);
        calculatorView.initMessage();
        scanner.close();
    }
}
