package test.linkedlist;

import main.java.com.okbraga.datastructures.linkedlist.LinkedList;
import main.java.com.okbraga.datastructures.models.Student;

public class Test {
    public static void main(String[] args) {
        Student maria = new Student();
        maria.setName("Maria");
        Student manoel = new Student();
        manoel.setName("Manoel");
        Student joaquim = new Student();
        joaquim.setName("Joaquim");
        LinkedList linkedList = new LinkedList();
        linkedList.add(maria);
        linkedList.add(manoel);
        linkedList.add(1, joaquim);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
