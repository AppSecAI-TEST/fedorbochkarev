package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тестирования класса Point.
 */

public class PointTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Метод проверки
     */
    public void whenAddOneTwoThenOneOne() {
        Point point = new Point(1, 2);
        boolean result = point.is(1, 1);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}