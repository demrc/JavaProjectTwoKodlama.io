package com.company;

public class UserManager {
    public void Login(User user){
        System.out.println(user.getFirstName()+user.getLastName()+" joined!");
    }
    public void Exit(User user){
        System.out.println(user.getFirstName()+user.getLastName()+" leave!");
    }

}
