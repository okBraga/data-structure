package main.java.com.okbraga.datastructures.stack;

import java.util.LinkedList;
import java.util.List;

public class ParameterizedStack<T> {

    private final List<T> objects = new LinkedList<>();

    public void add(T t) {
        this.objects.add(t);
    }

    public T remove() {
        return this.objects.remove(this.objects.size() - 1);
    }

    public boolean isEmpty() {
        return this.objects.size() == 0;
    }

}
