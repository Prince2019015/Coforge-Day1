package com.coforge;

public class Fraction {

    int numerator;
    int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // helper method to find GCD (for simplifying the result)
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        int g = gcd(numerator, denominator);
        if (g != 0) {
            numerator = numerator / g;
            denominator = denominator / g;
        }
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}