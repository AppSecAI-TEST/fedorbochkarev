package ru.job4j.max;

/**
 * Class максимального числа.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 06.08.2017
 */

public class Max {

    /**
     * Метод получения максимального числа
     *
     * @param first  первое число
     * @param second второе число
     * @return максимальное число
     * @since 06.08.2017
     */
    public int max(int first, int second) {
        int count;
        if (first > second) {
            count = first;
        } else {
            count = second;
        }
        return count;
    }
}
