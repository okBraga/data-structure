package test.vector;

import main.java.com.okbraga.datastructures.Vector;
import main.java.com.okbraga.datastructures.models.Student;

public class TestRemove {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Rafael");
        student2.setName("Paulo");
        Vector list = new Vector();
        list.add(student1);
        list.add(student2);
        list.remove(0);
        System.out.println(list);
    }
}
