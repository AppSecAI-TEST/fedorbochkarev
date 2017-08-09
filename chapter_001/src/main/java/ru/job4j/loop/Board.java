package ru.job4j.loop;

/**
 * Class Board.
 *
 * @author Fedor Bochkarev (mailto:fbochkarev@bk.ru)
 * @version 1
 * @since 09.08.2017
 */

public class Board {
    /**
     * Метод рисующий шахматную доску;
     *
     * @param width  - ширина
     * @param height - высота
     * @return - возвращает доску в консоли
     */
    public String paint(int width, int height) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        builder.append("Х");
                    else builder.append(" ");
                } else {
                    if (j % 2 == 0)
                        builder.append(" ");
                    else builder.append("Х");
                }
                if ( j != height - 1){
                    builder.append("\t");
                }
            }
            if ( i != width - 1) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
