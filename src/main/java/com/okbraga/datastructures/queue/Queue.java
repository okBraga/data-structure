package main.java.com.okbraga.datastructures.queue;

import main.java.com.okbraga.datastructures.models.Student;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    private final List<Student> students = new LinkedList<>();

    public void add(Student student) {
        this.students.add(student);
    }

    public Student remove() {
        return this.students.remove(0);
    }

    public boolean isEmpty() {
        return this.students.isEmpty();
    }
}
