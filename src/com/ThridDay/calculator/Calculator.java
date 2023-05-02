package com.ThridDay.calculator;

public class Calculator {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;
        
        Operation add = new Addition();
        Operation sub = new Subtraction();
        Operation mul = new Multiplication();
        Operation div = new Division();
        
        double result1 = add.execute(a, b);
        double result2 = sub.execute(a, b);
        double result3 = mul.execute(a, b);
        double result4 = div.execute(a, b);
        
        System.out.println(a + " + " + b + " = " + result1);
        System.out.println(a + " - " + b + " = " + result2);
        System.out.println(a + " * " + b + " = " + result3);
        System.out.println(a + " / " + b + " = " + result4);
    }
}

