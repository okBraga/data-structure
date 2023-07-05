package main.java.com.okbraga.datastructures.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericHashSet {

    private final List<List<Object>> table = new ArrayList<>();

    private int size = 0;

    public GenericHashSet() {
        for (int i = 0; i < 26; i++) {
            LinkedList<Object> list = new LinkedList<>();
            table.add(list);
        }
    }

    public void add(Object object) {
        if (!this.contains(object)) {
            this.verifyCharge();
            int index = this.hashCode(object);
            List<Object> list = this.table.get(index);
            list.add(object);
            this.size++;
        }
    }

    public void remove(Object object) {
        if (this.contains(object)) {
            int index = this.hashCode(object);
            List<Object> list = this.table.get(index);
            list.remove(object);
            this.size--;
            this.verifyCharge();
        }
    }

    public List<Object> getAll() {
        List<Object> objects = new ArrayList<>();

        for (List<Object> objectList : this.table) {
            objects.addAll(objectList);
        }

        return objects;
    }

    public boolean contains(Object object) {
        int index = this.hashCode(object);
        List<Object> list = this.table.get(index);
        return list.contains(object);
    }

    public int size() {
        return this.size;
    }

    private int hashCode(Object object) {
        int hashCode = object.hashCode();
        hashCode = Math.abs(hashCode);
        return hashCode % table.size();
    }

    private void resizeTable(int newCapacity) {
        List<Object> objects = this.getAll();
        this.table.clear();
        for (int i = 0; i < newCapacity; i++) {
            this.table.add(new LinkedList<>());
        }
        for (Object object : objects) {
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
        for (List<Object> list : this.table) {
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

}
