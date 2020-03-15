package com.example.junit.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Discriminant {

    private final DiscriminantCalculate discriminantCalculate;

    @Autowired
    public Discriminant(DiscriminantCalculate discriminantCalculate) {
        this.discriminantCalculate = discriminantCalculate;
    }

    public void menu() {
        System.out.println("\n-----------------------------------------\n");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first parameter");
            double a = scanner.nextDouble();
            System.out.println("Enter second parameter");
            double b = scanner.nextDouble();
            System.out.println("Enter third parameter");
            double c = scanner.nextDouble();

            double discriminant = discriminantCalculate.getDiscriminant(a, b, c);

            if (discriminant > 0) {
                double firstRoot = discriminantCalculate.getFirstRoot(discriminant, b, a);
                double secondRoot = discriminantCalculate.getSecondRoot(discriminant, b, a);
                System.out.println("Root : " + firstRoot +"   "+ secondRoot);
            } else if (discriminant == 0) {
                double doubleRoot = discriminantCalculate.getDoubleRoot(b, a);
                System.out.println("Root : " + doubleRoot);
            } else {
                System.out.println("No solution of equation");
            }
        }
    }
}
