package test.queue;

import main.java.com.okbraga.datastructures.models.Student;
import main.java.com.okbraga.datastructures.queue.Queue;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();

        Student student = new Student();
        queue.add(student);

        Student removedStudent = queue.remove();

        if (student != removedStudent) {
            System.out.println("Error: the removed Student is different from the inserted one");
        }

        if (!queue.isEmpty()) {
            System.out.println("Error: the Queue is not empty");
        }
    }
}
