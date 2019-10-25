package com.mockitopractice.services;

public class CalculatorServiceProvider {

    /***
     * This method provides with a CalculatorService type that will be assigned depending on the type
     * of the numbers
     * @param type String
     * @return CalculatorService
     */
    public CalculatorService getCalculatorService(String type) {
        return type.equals("int") ? new CalculatorInteger() : new CalculatorDecimal();
    }
}
