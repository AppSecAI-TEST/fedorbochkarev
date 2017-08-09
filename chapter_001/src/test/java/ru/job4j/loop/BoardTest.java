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

public class BoardTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Метод проверки
     */
    public void whenAddThreeThreeThenBoard() {
        Board board = new Board();
        String result = board.paint(3, 3);
        String expected = "Х\t \tХ\n" +
                " \tХ\t \n" +
                "Х\t \tХ";
        assertThat(result, is(expected));
    }

    public void whenAddFiveAndFourThreeThenBoard() {
        Board board = new Board();
        String result = board.paint(5, 4);
        String expected = "Х\t \tХ\t \tХ\n" +
                " \tХ\t \tХ\t \n" +
                "Х\t \tХ\t \tХ\n" +
                " \tХ\t \tХ\t ";
        assertThat(result, is(expected));
    }
}
