package main.java.com.okbraga.datastructures.map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<C, V> {

    private final List<List<Association<C, V>>> table = new ArrayList<>();

    public HashMap() {
        for (int i = 0; i < 100; i++) {
            this.table.add(new LinkedList<>());
        }
    }

    public boolean containsKey(C key) {
        int index = this.hashCode(key);
        List<Association<C, V>> list = this.table.get(index);

        for (Association<C, V> association : list) {
            if (association.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void remove(C key) {
        int index = this.hashCode(key);
        List<Association<C, V>> list = this.table.get(index);

        for (int i = 0; i < list.size(); i++) {
            Association<C, V> association = list.get(i);
            if (association.getKey().equals(key)) {
                list.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("The key does not exist");
    }

    public void add(C key, V value) {
        if (this.containsKey(key)) {
            this.remove(key);
        }
        int index = this.hashCode(key);
        List<Association<C, V>> list = this.table.get(index);
        list.add(new Association<>(key, value));
    }

    public V get(C key) {
        int index = this.hashCode(key);
        List<Association<C, V>> list = this.table.get(index);

        for (Association<C, V> association : list) {
            if (association.getKey().equals(key)) {
                return association.getValue();
            }
        }
        throw new IllegalArgumentException("The key does not exist");
    }

    private int hashCode(C key) {
        return Math.abs(key.hashCode()) % this.table.size();
    }

    private List<Association<C, V>> getAll() {
        ArrayList<Association<C, V>> associations =
                new ArrayList<>();
        for (List<Association<C, V>> list : this.table) {
            associations.addAll(list);
        }
        return associations;
    }
    @Override
    public String toString() {
        return this.getAll().toString();
    }
}

