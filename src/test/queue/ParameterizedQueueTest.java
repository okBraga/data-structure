package test.queue;

import main.java.com.okbraga.datastructures.models.Student;
import main.java.com.okbraga.datastructures.queue.ParameterizedQueue;

public class ParameterizedQueueTest {
    public static void main(String[] args) {
        ParameterizedQueue<Student> parameterizedQueue = new ParameterizedQueue<>();

        Student student = new Student();
        parameterizedQueue.add(student);

        Student removedStudent = parameterizedQueue.remove();

        if (student != removedStudent) {
            System.out.println("Error: the removed Student is different from the inserted one");
        }

        if (!parameterizedQueue.isEmpty()) {
            System.out.println("The Queue is not empty");
        }

        ParameterizedQueue<String> stringQueue = new ParameterizedQueue<>();

        stringQueue.add("Millena");
        stringQueue.add("Filipe");

        System.out.println(stringQueue.remove());
        System.out.println(stringQueue.remove());
    }
}
