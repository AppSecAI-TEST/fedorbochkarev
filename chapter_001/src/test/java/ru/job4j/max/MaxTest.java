package ru.job4j.max;

/**
 * Class максимального числа.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 06.08.2017
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирование класса Max.
 */
public class MaxTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Тестирование мерода получания максимаьного числа
     */
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
}
