package test.linkedlist;

import main.java.com.okbraga.datastructures.LinkedList;

public class TestGet {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Filipe");
        linkedList.add("Millena");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
    }
}
