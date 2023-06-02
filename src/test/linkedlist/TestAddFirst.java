package test.linkedlist;

import main.java.com.okbraga.datastructures.LinkedList;

public class TestAddFirst {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst("Rafael");
        linkedList.addFirst("Paulo");

        System.out.println(linkedList);
    }
}
