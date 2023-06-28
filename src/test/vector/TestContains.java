package test.vector;

import main.java.com.okbraga.datastructures.models.Student;
import main.java.com.okbraga.datastructures.vector.Vector;

public class TestContains {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Rafael");
        student2.setName("Paulo");

        Vector list = new Vector();

        list.add(student1);
        list.add(student2);

        System.out.println(list.contains(student1));

        System.out.println(list.contains(student2));

        Student Student = new Student();
        Student.setName("Ana");

        System.out.println(list.contains(Student));
    }
}

