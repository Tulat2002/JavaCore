package org.example.lap6;

import java.util.ArrayList;

public class Bai02 {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Anktu");
        Student student2 = new Student(2, "Ngoc");
        Student student3 = new Student(3, "Luong");
        Student student4 = new Student(4, "Ly");
        Student student5 = new Student(5, "Nguyen");

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        for (int i = 0; i < list.size(); i ++){
            if (list.get(i).getName().startsWith("Nguyen")){
                System.out.println("start with Nguyen " + list.get(i));
            }
        }
    }

}
