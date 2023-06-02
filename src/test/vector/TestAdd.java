package test.vector;

import main.java.com.okbraga.datastructures.Vector;
import main.java.com.okbraga.datastructures.models.Student;

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

        list.add(0 ,student2);
        list.add(1 ,student1);

        System.out.println(list);
    }
}
