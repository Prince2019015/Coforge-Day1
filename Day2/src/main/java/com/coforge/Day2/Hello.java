package com.coforge.Day2;

public class Hello implements Interface1, Interface2 {

    String name = "prince";

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.sayHello();
    }
}