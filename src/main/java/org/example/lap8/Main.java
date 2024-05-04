package org.example.lap8;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("123", "Anktu", 18, 3);
        System.out.println(student);
        student.setGrade();
        System.out.println(student);

        Person person = new Person("123", "Atu", 22);
        System.out.println(person);
    }

}
