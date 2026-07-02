package com.coforge;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {
        super();
    }

    @Override
    public void area() {
        System.out.println("Area : " + (length * breadth));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter : " + (2 * (length + breadth)));
    }
}