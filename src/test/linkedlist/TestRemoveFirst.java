package test.linkedlist;

import main.java.com.okbraga.datastructures.linkedlist.LinkedList;

public class TestRemoveFirst {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add("Paulo");
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}
