package main.java.com.okbraga.datastructures.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashSet {

    private final List<List<String>> table = new ArrayList<>();
    private int size = 0;

    public HashSet() {
        for (int i = 0; i < 26; i++) {
            LinkedList<String> list = new LinkedList<>();
            table.add(list);
        }
    }

    private int hashFunction(String word) {
        int hashCode = this.hashCode(word);
        hashCode = Math.abs(hashCode);
        return hashCode % this.table.size();
    }

    private int hashCode(String word) {
        int code = 1;
        for (int i = 0; i < word.length(); i++) {
            code = 31 * code + word.charAt(i);
        }
        return code;
    }

    public void printTable() {
        for (List<String> list : this.table) {
            System.out.println("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.println("*");
            }
            System.out.println("]");
        }
    }

    public void resizeTable(int newCapacity) {
        List<String> words = this.getAll();
        this.table.clear();

        for (int i = 0; i < newCapacity; i++) {
            this.table.add(new LinkedList<>());
        }

        for (String word : words) {
            this.add(word);
        }
    }

    public void verifyCharge() {
        int capacity = this.table.size();
        double charge = (double) this.size / capacity;

        if (charge > 0.75) this.resizeTable(capacity * 2);
        else if (charge < 0.25) this.resizeTable(Math.max(capacity / 2, 10));
    }

    public void add(String word) {
        if (!this.contains(word)) {
            this.verifyCharge();
            int index = this.hashFunction(word);
            List<String> list = this.table.get(index);
            list.add(word);
            this.size++;
        }
    }

    public void remove(String word) {
        if (this.contains(word)) {
            int index = this.hashFunction(word);
            List<String> list = this.table.get(index);
            list.remove(word);
            this.size--;
            verifyCharge();
        }
    }

    public boolean contains(String word) {
        int index = this.hashFunction(word);
        List<String> list = this.table.get(index);

        return list.contains(word);
    }

    public List<String> getAll() {
        List<String> words = new ArrayList<>();

        for (List<String> strings : table) {
            words.addAll(strings);
        }

        return words;
    }

    public int size() {
        return size;
    }
}
