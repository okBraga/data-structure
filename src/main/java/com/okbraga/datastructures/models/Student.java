package main.java.com.okbraga.datastructures.models;

public class Student {

    private String name;

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Student student) {
        Student other = (Student) student;
        return this.name.equals(other.name);
    }
}
