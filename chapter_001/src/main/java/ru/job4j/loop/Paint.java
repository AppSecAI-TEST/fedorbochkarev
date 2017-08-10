package ru.job4j.loop;

/**
 * Class Paint.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 09.08.2017
 */

public class Paint {
    /**
     * Метод рисующий пирамиду;
     *
     * @param h  - высота пирамиды
     * @return - возвращает доску в консоли
     */
    public String piramid(int h){

        StringBuilder builder = new StringBuilder();
        int x = 0; // - ширина пирамиды
        for (int i = 0; i < h; i++) {
            x = h + i;
        }

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < x; j++) {
                if (i == 0 && j == (x / 2))builder.append("^");
                else if (j >= ((x / 2) - i) && j <= ((x / 2) + i)) builder.append("^");
                else builder.append(" ");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
