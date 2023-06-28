package main.java.com.okbraga.datastructures.stack;

import java.util.LinkedList;
import java.util.List;

public class GenericStack {

    private final List<Object> objects = new LinkedList<>();

    public void add(Object object) {
        this.objects.add(object);
    }

    public Object remove() {
        return this.objects.remove(this.objects.size() - 1);
    }

    public boolean isEmpty() {
        return this.objects.size() == 0;
    }
}
