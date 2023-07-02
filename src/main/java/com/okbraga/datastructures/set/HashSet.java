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
        return word.toLowerCase().charAt(0) % 26;
    }

    public void add(String word) {
        if (!this.contains(word)) {
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
