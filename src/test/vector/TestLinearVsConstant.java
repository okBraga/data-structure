package test.vector;

import main.java.com.okbraga.datastructures.Vector;
import main.java.com.okbraga.datastructures.models.Student;

public class TestLinearVsConstant {

    public static void main(String[] args) {


        Vector vector = new Vector();
        long start = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            Student student = new Student();
            vector.add(student);
        }
        long end = System.currentTimeMillis();
        double time = (end - start) / 1000.0;
        System.out.println("Time in seconds = " + time);
    }
}
