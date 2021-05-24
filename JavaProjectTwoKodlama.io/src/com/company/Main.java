package com.company;

public class Main {
    //sample codes, you can add any code if you want to try
    public static void main(String[] args) {
    Instructor instructor1 = new Instructor();
    instructor1.setFirstName("Someone 1");

    Student student1 = new Student();
    student1.setFirstName("Someone 2");

    StudentManager studentManager = new StudentManager();
    studentManager.Exit(student1);

    InstructorManager instructorManager = new InstructorManager();
    instructorManager.Login(instructor1);

    UserManager userManager=new UserManager();
    userManager.Login(student1);
    }
}
