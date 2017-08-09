package ru.job4j.condition;

/**
 * Class .
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 08.08.2017
 */

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean is(int a, int b) {
        if (y == a * x + b) {
            return true;
        }
        return false; // используя координаты точки и вычисления функции.
    }
}