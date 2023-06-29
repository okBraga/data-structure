package test.queue;

import main.java.com.okbraga.datastructures.models.Student;
import main.java.com.okbraga.datastructures.queue.GenericQueue;

public class GenericQueueTest {
    public static void main(String[] args) {
        GenericQueue genericQueue = new GenericQueue();

        Student student = new Student();
        genericQueue.add(student);

        Object removedStudent = genericQueue.remove();

        if (student != removedStudent) {
            System.out.println("Error: the removed Student is different from the inserted one");
        }

        if (!genericQueue.isEmpty()) {
            System.out.println("The Queue is not empty");
        }
    }
}
