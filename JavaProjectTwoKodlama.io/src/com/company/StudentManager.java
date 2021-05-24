package com.company;

public class StudentManager extends UserManager {
    @Override
    public void Login(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" joined!");
    }
    @Override
    public void Exit(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" leave!");
    }
    public void Grades(Student student){
        System.out.println(student.getGrade());
    }
}
