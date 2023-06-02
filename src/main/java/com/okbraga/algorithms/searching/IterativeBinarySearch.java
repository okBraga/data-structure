package main.java.com.okbraga.algorithms.searching;

public class IterativeBinarySearch {

    public static int binarySearchWhile(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchFor(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        for (int i = start; i <= end; ) {
            int mid = start + (end - start) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}