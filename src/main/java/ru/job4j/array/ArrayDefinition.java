package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prices = new float[40];
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Jorge Doj";
        names[1] = "Hoy Boy";
        names[2] = "Vladimir Putin";
        names[3] = "Stas Kastushkin";
        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }
    }
}
