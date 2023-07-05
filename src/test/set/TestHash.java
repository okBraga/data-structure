package test.set;

import main.java.com.okbraga.datastructures.set.HashSet;

public class TestHash {
    public static void main(String[] args) {

        HashSet set = new HashSet();

        for (int i = 0; i < 100; i++) {
            set.add("" + i);
        }
        set.printTable();
    }
}
