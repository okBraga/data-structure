package test.set;

import main.java.com.okbraga.datastructures.set.HashSet;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Filipe");
        set.add("Millena");
        set.add("Heitor");

        List<String> words = set.getAll();

        System.out.println("Before remove");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Set size: " + set.size());

        set.remove("Filipe");

        words = set.getAll();

        System.out.println("After remove");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Set size: " + set.size());
    }
}
