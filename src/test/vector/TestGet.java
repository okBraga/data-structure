package test.vector;

import main.java.com.okbraga.datastructures.models.Student;
import main.java.com.okbraga.datastructures.vector.Vector;

public class TestGet {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Rafael");
        student2.setName("Paulo");
        Vector list = new Vector();
        list.add(student1);
        list.add(student2);
        Object Student1 = list.get(0);
        Object Student2 = list.get(1);
        System.out.println(Student1);
        System.out.println(Student2);
    }
}
