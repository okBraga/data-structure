package test.set;

import java.util.HashSet;

public class HashSetJavaTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Filipe");
        set.add("Filipe");
        set.add("Millena");
        set.add("Heitor");

        System.out.println(set);
    }
}
