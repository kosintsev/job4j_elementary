package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        boolean isOut = x1 > 7 && y1 > 7 && x2 > 7 && y2 > 7;
        boolean isNotPositive = (y1 * x2) * (y2 * x1) < 0;
        boolean isNotDiagonal = Math.abs(x2 - x1) - Math.abs(y2 - y1) != 0;
        if (isNotPositive || isNotDiagonal || isOut) {
            return rsl;
        }
        rsl = Math.abs(x2 - x1);
        rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        return rsl;
    }
}