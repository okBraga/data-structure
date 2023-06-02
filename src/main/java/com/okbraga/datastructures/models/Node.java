package main.java.com.okbraga.datastructures.models;

public class Node {

    private Node next;

    private Object element;

    public Node(Node next, Object element) {
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }
}
