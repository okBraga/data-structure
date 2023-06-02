package main.java.com.okbraga.algorithms.searching;

public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}