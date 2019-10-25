package com.mockitopractice.services;

public class CalculatorInteger implements CalculatorService<Integer> {

    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
