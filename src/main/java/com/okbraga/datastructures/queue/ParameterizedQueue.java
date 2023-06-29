package main.java.com.okbraga.datastructures.queue;

import java.util.LinkedList;
import java.util.List;

public class ParameterizedQueue<T> {
    List<T> elements = new LinkedList<>();

    public void add(T t) {
        this.elements.add(t);
    }

    public T remove() {
        return this.elements.remove(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
