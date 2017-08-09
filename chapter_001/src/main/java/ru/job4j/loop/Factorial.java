package ru.job4j.loop;

/**
 * Class вычисляющий Factorial.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 09.08.2017
 */

public class Factorial {
    /**
     * Метод вычисляет факториал;
     *
     * @param n
     * @return
     */
    public int calc(int n) {
        return (n == 0) ? 1 : n * calc(n - 1);
    }
}
