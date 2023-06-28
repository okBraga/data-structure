package test.linkedlist;

import main.java.com.okbraga.datastructures.linkedlist.LinkedList;

public class TestAddFirst {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst("Filipe");
        linkedList.addFirst("Millena");

        System.out.println(linkedList);
    }
}
