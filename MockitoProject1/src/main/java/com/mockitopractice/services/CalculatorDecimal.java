package com.mockitopractice.services;

public class CalculatorDecimal implements CalculatorService<Double> {

    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }
}
