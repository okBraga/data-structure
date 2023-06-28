package test.vector;

import main.java.com.okbraga.datastructures.models.Student;
import main.java.com.okbraga.datastructures.vector.Vector;

public class TestAdd {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Filipe");
        student2.setName("Millena");

        Vector list = new Vector();

        list.add(student1);
        list.add(student2);

        System.out.println(list);
    }
}
