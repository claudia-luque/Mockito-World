package com.mockitopractice.services;


/***
 * Service interface that will provide the right calculator type
 * @param <T> of type: Integer/Double
 *           values of <T> are for this specific example.
 */
public interface CalculatorService<T> {
    T add(T a, T b);
}
