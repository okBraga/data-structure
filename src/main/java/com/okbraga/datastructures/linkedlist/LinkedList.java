package main.java.com.okbraga.datastructures.linkedlist;

public class LinkedList {

    private Node first;
    private Node last;

    private int elements;

    private boolean isPresent(int position) {
        return position >= 0 && position < this.elements;
    }

    private Node getNode(int position) {
        if (!this.isPresent(position)) {
            throw new IllegalArgumentException("Position doesn't exist!");
        }

        Node currentNode = first;

        for (int i = 0; i < position; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    public void add(Object element) {
        if (this.elements == 0) this.addFirst(element);
        else {
            Node newNode = new Node(element);
            this.last.setNext(newNode);
            newNode.setPrevious(this.last);
            this.last = newNode;
            this.elements++;
        }

    }

    public void add(int position, Object element) {
        if (position == 0) this.addFirst(element);
        else if (position == this.elements) {
            this.add(element);
        } else {
            Node previousNode = this.getNode(position - 1);
            Node next = previousNode.getNext();
            Node newNode = new Node(previousNode.getNext(), element);
            newNode.setPrevious(previousNode);
            previousNode.setNext(newNode);
            next.setPrevious(newNode);
            this.elements++;
        }
    }

    public void addFirst(Object element) {
        if (this.elements == 0) {
            Node newNode = new Node(element);
            this.first = newNode;
            this.last = newNode;
        } else {
            Node newNode = new Node(this.first, element);
            this.first.setPrevious(newNode);
            this.first = newNode;
        }
        this.elements++;
    }

    public Object get(int position) {
        return this.getNode(position).getElement();
    }

    public void remove(int position) {
        if (!this.isPresent(position)) throw new IllegalArgumentException("Position doesn't exist");

        if (position == 0) {
            this.removeFirst();
        } else if (position == this.elements - 1) {
            this.removeLast();
        } else {
            Node previous = this.getNode(position - 1);
            Node currentNode = previous.getNext();
            Node next = currentNode.getNext();

            previous.setNext(next);
            next.setPrevious(previous);

            this.elements--;
        }
    }

    public void removeFirst() {
        if (!this.isPresent(0)) throw new IllegalArgumentException("Position doesn't exist");

        this.first = this.first.getNext();
        this.elements--;

        if (this.elements == 0) {
            this.last = null;
        }
    }

    public void removeLast() {
        if (!this.isPresent(this.elements - 1)) throw new IllegalArgumentException("Position doesn't exist");

        if (this.elements == 1) {
            this.removeFirst();
        } else {
            Node penultimate = this.last.getPrevious();
            penultimate.setNext(null);
            this.last = penultimate;
            this.elements--;
        }
    }

    public int size() {
        return elements;
    }

    public boolean contains(Object element) {
        Node curentNode = this.first;

        while (curentNode != null) {
            if (curentNode.getElement().equals(element)) {
                return true;
            }
            curentNode = curentNode.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.elements == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node currentNode = first;

        for (int i = 0; i < this.elements - 1; i++) {
            builder.append(currentNode.getElement());
            builder.append(", ");
            currentNode = currentNode.getNext();
        }

        builder.append(currentNode.getElement());
        builder.append("]");
        return builder.toString();
    }
}
