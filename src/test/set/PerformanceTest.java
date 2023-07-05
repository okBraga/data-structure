package test.set;

import main.java.com.okbraga.datastructures.set.HashSet;

public class PerformanceTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        HashSet set = new HashSet();

        for (int i = 0; i < 50000; i++) {
            set.add("word" + i);
        }

        for (int i = 0; i < 50000; i++) {
            set.contains("word" + i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) / 1000.0);
    }
}
