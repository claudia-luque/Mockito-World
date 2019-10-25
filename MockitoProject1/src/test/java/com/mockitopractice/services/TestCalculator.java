package com.mockitopractice.services;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

public class TestCalculator {
    private CalculatorServiceProvider calculatorServiceProvider;
    private Integer INTEGER_SERVICE_RESULT = 3;
    private Double DECIMAL_SERVICE_RESULT = 3.2;

    @Before
    public void Setup() {
        // Service type mocks
        CalculatorInteger calculatorInteger = mock(CalculatorInteger.class);
        CalculatorDecimal calculatorDecimal = mock(CalculatorDecimal.class);

        // Stubs for the add method from each service
        doReturn(INTEGER_SERVICE_RESULT).when(calculatorInteger).add(anyInt(), anyInt());
        doReturn(DECIMAL_SERVICE_RESULT).when(calculatorDecimal).add(anyDouble(), anyDouble());

        // Real service provider object
        calculatorServiceProvider = new CalculatorServiceProvider();
    }

    @Test
    public void testCalculatorIntegersAdd() {
    	CalculatorService serviceInteger = calculatorServiceProvider.getCalculatorService("int");
    	assertEquals("Return a Integer", serviceInteger.add(1, 2), INTEGER_SERVICE_RESULT);
    }

    @Test
    public void testCalculatorDecimalsAdd() {
    	CalculatorService serviceDecimals = calculatorServiceProvider.getCalculatorService("double");
    	assertEquals("Return a Double", serviceDecimals.add(1.0, 2.2), DECIMAL_SERVICE_RESULT);
    }

}
