package com.ti;

import java.util.Scanner;

public class ArithmeticOperators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1/num2;

        System.out.println("The sum of the 2 numbers is: " + sum);
        System.out.printf("The difference between the 2 numbers is %f%n", sub);
        System.out.println("The sub of the 2 numbers is: " + sub);
        System.out.println("The mult of the 2 numbers is: " + mult);
        System.out.println("The div of the 2 numbers is: " + div);

    }
}
