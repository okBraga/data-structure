package test.vector;

import main.java.com.okbraga.datastructures.Vector;
import main.java.com.okbraga.datastructures.models.Student;

public class TestAddPosition {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("Rafael");
        student2.setName("Paulo");
        student3.setName("Ana");
        Vector lista = new Vector();
        lista.add(student1);
        lista.add(0, student2);
        lista.add(1, student3);
        System.out.println(lista);
    }
}
