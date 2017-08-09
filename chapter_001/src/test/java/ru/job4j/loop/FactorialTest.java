package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 05.08.2017
 */

public class FactorialTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Метод проверки
     */
    public void whenAddFiveThenOneHundredTwenty(){
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    public void whenAddZeroThenOne(){
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}
