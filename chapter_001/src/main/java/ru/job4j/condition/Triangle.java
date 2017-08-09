package ru.job4j.condition;

/**
 * Class .
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 09.08.2017
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        //calculate the triangle area
        return Math.abs((a.getX() - c.getX()) * (b.getY() - c.getY()) - ((b.getX() - c.getX()) * (a.getY() - c.getY()))) / 2;
    }
}
