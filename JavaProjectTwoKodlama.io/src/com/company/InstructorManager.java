package com.company;

public class InstructorManager extends UserManager {
    @Override
    public void Login(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" joined!");
    }
    @Override
    public void Exit(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" leave!");
    }
    public void Course(Instructor instructor){
        System.out.println(instructor.getMajor());

    }
}
