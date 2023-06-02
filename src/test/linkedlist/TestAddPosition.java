package test.linkedlist;

import main.java.com.okbraga.datastructures.LinkedList;

public class TestAddPosition {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add(0, "Paulo");
        linkedList.add(1, "Camila");
        System.out.println(linkedList);
    }
}
