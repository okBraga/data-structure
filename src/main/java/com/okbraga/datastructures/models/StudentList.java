package main.java.com.okbraga.datastructures.models;

public class StudentList {
    private String name;
    private int age;
    private StudentList next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
