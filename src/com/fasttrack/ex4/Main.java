package com.fasttrack.ex4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Alex",5);
        Student student2=new Student("Mihai",6);
        Student student3=new Student("George",8);
        Student student4=new Student("Alina",10);
        System.out.println(Student.averageGrade());
        System.out.println(student1.getGrade()+student2.getGrade()+student3.getGrade()+student4.getGrade());
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student1);


    }
}
