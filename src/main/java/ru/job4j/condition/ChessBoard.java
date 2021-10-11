package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        if (isOut(x1, y1, x2, y2) || isNotDiagonal(x1, y1, x2, y2)) {
            return 0;
        }
        return Math.abs(x2 - x1);
    }

    public static boolean isOut(int x1, int y1, int x2, int y2) {
        return x1 > 7 || x1 < 0 || y1 > 7 || y1 < 0 || x2 > 7 || x2 < 0 || y2 > 7 || y2 < 0;
    }

    public static boolean isNotDiagonal(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) - Math.abs(y2 - y1) != 0;
    }
}
