package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test BubbleSort class.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 10.08.2017
 */

public class BubbleSortTest {
    /**
     * Test add.
     */
    @Test
    /**
     * Методы проверки
     */
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {5, 1, 2, 7, 3};
        int[] result = bubbleSort.sort(array);
        int[] expected = {1, 2, 3, 5, 7} ;
        assertThat(result, is(expected));
    }
}
