package main.java.com.okbraga.datastructures.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ParameterizedHashSet<T> {

    private final List<List<T>> table = new ArrayList<>();

    private int size = 0;

    public ParameterizedHashSet() {
        for (int i = 0; i < 26; i++) {
            LinkedList<T> list = new LinkedList<>();
            table.add(list);
        }
    }

    public void add(T object) {
        if (!this.contains(object)) {
            this.verifyCharge();
            int index = this.hashCode(object);
            List<T> list = this.table.get(index);
            list.add(object);
            this.size++;
        }
    }

    public void remove(T object) {
        if (this.contains(object)) {
            int index = this.hashCode(object);
            List<T> list = this.table.get(index);
            list.remove(object);
            this.size--;
            this.verifyCharge();
        }
    }

    public List<T> getAll() {
        List<T> objects = new ArrayList<>();

        for (List<T> objectList : this.table) {
            objects.addAll(objectList);
        }

        return objects;
    }

    public boolean contains(T object) {
        int index = this.hashCode(object);
        List<T> list = this.table.get(index);

        return list.contains(object);
    }

    public int size() {
        return this.size;
    }

    private int hashCode(T object) {
        int hashCode = object.hashCode();
        hashCode = Math.abs(hashCode);
        return hashCode % table.size();
    }

    private void resizeTable(int newCapacity) {
        List<T> objects = this.getAll();
        this.table.clear();

        for (int i = 0; i < newCapacity; i++) {
            this.table.add(new LinkedList<>());
        }

        for (T object : objects) {
            this.add(object);
        }
    }

    private void verifyCharge() {
        int capacity = this.table.size();
        double charge = (double) this.size / capacity;

        if (charge > 0.75) {
            this.resizeTable(capacity * 2);
        } else if (charge < 0.25) {
            this.resizeTable(Math.max(capacity / 2, 10));
        }
    }

    public void printTable() {
        for (List<T> list : this.table) {
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }
}
