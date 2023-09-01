package com.example.start.controller;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorController cc = new CalculatorController();
        Double result = cc.add(4.5,6.5,4.2);
        System.out.println(result);
    }
}
