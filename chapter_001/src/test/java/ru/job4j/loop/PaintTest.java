package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test Board class.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 09.08.2017
 */

public class PaintTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Метод проверки
     */
    public void whenAddTwoThenPaint() {
        Paint paint = new Paint();

        String result = paint.piramid(2);
        String expected = " ^ \n" +
                "^^^\n";
        assertThat(result, is(expected));
    }

    public void whenAddThreeThenPaint() {
        Paint paint = new Paint();

        String result = paint.piramid(3);
        String expected = "  ^  \n" +
                " ^^^ \n" +
                "^^^^^\n";
        assertThat(result, is(expected));
    }
}
