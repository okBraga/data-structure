package main.java.com.okbraga.datastructures.map;

public class Association<C, V> {
    private final C key;
    private final V value;

    public Association(C key, V value) {
        this.key = key;
        this.value = value;
    }

    public C getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" + this.key + " -> " + this.value + "}";
    }
}
