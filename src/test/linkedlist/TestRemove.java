package test.linkedlist;

import main.java.com.okbraga.datastructures.LinkedList;

public class TestRemove {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Rafael");
        linkedList.add("Paulo");
        linkedList.add("Camila");

        System.out.println(linkedList);

        linkedList.remove(1);

        System.out.println(linkedList);
    }

}
