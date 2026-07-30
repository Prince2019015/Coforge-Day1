package com.coforge;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Modulus by zero is not allowed!");
                } else {
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, /, or %");
        }

        sc.close();
    }
}