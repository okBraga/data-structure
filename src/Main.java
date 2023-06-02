import static main.java.com.okbraga.algorithms.searching.BinarySearch.binarySearch;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int result = binarySearch(arr, 91);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at "
                    + "index " + result);
        }
    }
}
