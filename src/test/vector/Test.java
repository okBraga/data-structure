package test.vector;

import main.java.com.okbraga.datastructures.models.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList vectorWithoutGenerics = new ArrayList();
        ArrayList<Student> vectorWithGenerics = new ArrayList<Student>();
        Student student = new Student();
        vectorWithoutGenerics.add(student);
        vectorWithGenerics.add(student);
        Student student1 = (Student) vectorWithoutGenerics.get(0);
        Student student2 = vectorWithGenerics.get(0);
    }
}
