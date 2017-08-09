package ru.job4j.loop;

/**
 * Class .
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 09.08.2017
 */

public class Counter {
    /**
     * Метод вычисляет сумму четныx чисел в диапазоне от start до finish;
     *
     * @param start
     * @param finish
     * @return
     */
    public int add(int start, int finish) {
        int count = 0;
        for (int i = start; i < finish + 1; i++) {
            if (i % 2 == 0) {
                count = count + i;
            }
        }
        return count;
    }
}
