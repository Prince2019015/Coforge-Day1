package com.coforge;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    @Override
    public void area() {
        System.out.println("Area : " + (Math.PI * radius * radius));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter : " + (2 * Math.PI * radius));
    }
}