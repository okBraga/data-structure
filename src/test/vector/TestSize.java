package test.vector;

import main.java.com.okbraga.datastructures.Vector;
import main.java.com.okbraga.datastructures.models.Student;

public class TestSize {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("Rafael");
        student2.setName("Paulo");
        Vector list = new Vector();
        list.add(student1);
        list.add(student2);
        System.out.println(list.size());
        list.add(student3);
        System.out.println(list.size());
    }
}