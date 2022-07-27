package com.fasttrack.ex4;

public class Student {
    private   String name;

    private int grade;

    private static int SumOfGrades;
    private static int NumberOfStudents;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        SumOfGrades += 1;
        NumberOfStudents+=1;

    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
    static double averageGrade(){
        return (double) SumOfGrades / (double) NumberOfStudents;
    }

    @Override
    public String toString() {
        return "Student{" +  '\''+"Number of Students: " + NumberOfStudents+  '}';
    }
}
