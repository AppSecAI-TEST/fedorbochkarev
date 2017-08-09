package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 05.08.2017
 */
public class CounterTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Метод проверки
     */
    public void whenAddOneTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1,10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}

