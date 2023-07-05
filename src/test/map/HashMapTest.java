package test.map;

import main.java.com.okbraga.datastructures.models.Car;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Car> map = new HashMap<>();
        map.put("abc1234", new Car("a"));
        System.out.println(map);
        map.put("abc1234", new Car("b"));
        System.out.println(map);
        map.put("def1234", new Car("c"));
        System.out.println(map);
        System.out.println(map.containsKey("abc1234"));
        System.out.println(map.get("abc1234"));
        map.remove("abc1234");
        System.out.println(map);
    }
}
