package main.java.com.okbraga.datastructures.queue;

import java.util.LinkedList;
import java.util.List;

public class GenericQueue {

    private final List<Object> elements = new LinkedList<>();

    public void add(Object object) {
        this.elements.add(object);
    }

    public Object remove() {
        return this.elements.remove(0);
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }
}
