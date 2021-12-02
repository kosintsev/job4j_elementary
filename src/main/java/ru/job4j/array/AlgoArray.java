package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        boolean isSorted;
        int bubble;
        do {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]){
                    isSorted = false;
                    bubble = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bubble;
                }
            }
        } while (!isSorted);
        for (int element : array) {
            System.out.println(element);
        }
    }
}
