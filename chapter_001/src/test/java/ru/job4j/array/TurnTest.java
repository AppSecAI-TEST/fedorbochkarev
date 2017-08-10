package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test Turn class.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 10.08.2017
 */

public class TurnTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Методы проверки
     */
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = {2, 6, 1, 4};
        int[] result = turn.back(array);
        int[] expected = {4, 1, 6, 2} ;
        assertThat(result, is(expected));
    }

    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = {5, 4, 3, 2, 1};
        int[] result = turn.back(array);
        int[] expected = {1, 2, 3, 4, 5} ;
        assertThat(result, is(expected));
    }

}
