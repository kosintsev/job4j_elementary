package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 420;
        float expectedEuro = 6;
        float out = Converter.rubleToEuro(in);
        boolean passed = expectedEuro == out;
        System.out.println("140 rubles are 6. Test result : " + passed);
        float expectedDollar = 7;
        out = Converter.rubleToDollar(in);
        passed = expectedDollar == out;
        System.out.println("140 rubles are 7. Test result : " + passed);
    }
}
