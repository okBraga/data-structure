package test.map;

import main.java.com.okbraga.datastructures.map.ListMap;
import main.java.com.okbraga.datastructures.models.Car;

public class ListMapPerformanceTest {

    public static void main(String[] args) {

        ListMap listMap = new ListMap();
        int elementNumber = 15000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < elementNumber; i++) {
            listMap.add("" + i, new Car("c" + i));
        }
        for (int i = 0; i < elementNumber; i++) {
            listMap.get("" + i);
        }
        for (int i = 0; i < elementNumber; i++) {
            listMap.containsKey("" + i);
        }
        for (int i = 0; i < elementNumber; i++) {
            listMap.remove("" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) / 1000.0);
    }
}
