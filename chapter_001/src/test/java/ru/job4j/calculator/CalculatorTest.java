package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тестирования класса Calculator.
 */
public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Метод проверки суммирования двух чисел.
     */
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Метод проверки разницы двух чисел.
     */
    public void whenAddOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Метод проверки деления двух чисел.
     */
    public void whenAddOneDivOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Метод проверки умножения двух чисел.
     */
    public void whenAddOnePlusOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}