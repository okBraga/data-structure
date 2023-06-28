package main.java.com.okbraga.datastructures.linkedlist;

public class Node {

    private Node next;

    private Node previous;
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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Node{" + "next:" + next + ", element:" + element + '}';
    }
}
