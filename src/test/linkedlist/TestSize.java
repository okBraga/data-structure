package test.linkedlist;

import main.java.com.okbraga.datastructures.LinkedList;

public class TestSize {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("Rafael");
        linkedList.add("Paulo");

        System.out.println(linkedList.size());

        linkedList.add("Camila");

        System.out.println(linkedList.size());
    }
}
