package ru.job4j.calculator;

/**
 * Class Калькулятор + - * / ^.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 04.08.2017
 */

public class Calculator {
    /**
     * @voids
     */
    private double result;

    /**
     * Метод считает сумму двух чисел.
     *
     * @param first первое число
     * @param second второе число
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод считает разницу двух чисел.
     *
     * @param first первое число
     * @param second второе число
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Метод делет два чисела.
     *
     * @param first первое число
     * @param second второе число
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Метод умножает два числа.
     *
     * @param first первое число
     * @param second второе число
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Метод возвращает переменную результат.
     *
     * @return возвращает результат
     */
    public double getResult() {
        return result;
    }
}
