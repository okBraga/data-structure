package test.performance.vectorvslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceTest {
    public static void main(String[] args) {
        ArrayList<String> vector = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        int elementsNumber = 100000;

        long start = System.currentTimeMillis();
        for (int i = 0; i < elementsNumber; i++) {
            vector.add(0, "" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Vector addFirst: " + (end - start) / 1000.0);

        start = System.currentTimeMillis();
        for (int i = 0; i < elementsNumber; i++) {
            linkedList.add(0, "" + i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList addFirst: " + (end - start) / 1000.0);

        start = System.currentTimeMillis();
        for (int i = 0; i < elementsNumber; i++) {
            vector.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Vector get: " + (end - start) / 1000.0);

        start = System.currentTimeMillis();
        for (int i = 0; i < elementsNumber; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList get: " + (end - start) / 1000.0);

        start = System.currentTimeMillis();
        for (int i = 0; i < elementsNumber; i++) {
            vector.remove(0);
        }
        end = System.currentTimeMillis();

        System.out.println("Vector removeFirst: " + (end - start) / 1000.0);

        start = System.currentTimeMillis();
        for (int i = 0; i < elementsNumber; i++) {
            linkedList.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList removeFirst: " + (end - start) / 1000.0);

    }
}
