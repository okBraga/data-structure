package test.vector;

import main.java.com.okbraga.datastructures.Vector;
import main.java.com.okbraga.datastructures.models.Student;

public class Test {
    public static void main(String[] args) {
        Vector list = new Vector();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setName("Filipe");
        student2.setName("Millena");
        student3.setName("Heitor");
        student4.setName("Cindy");
        student5.setName("Flintch");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        System.out.println(list);

        list.remove(1);

        System.out.println(list);
    }
}
