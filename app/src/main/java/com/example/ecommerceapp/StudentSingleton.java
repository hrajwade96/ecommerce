package com.example.ecommerceapp;

public class StudentSingleton {


    private static StudentSingleton instance;


    private StudentSingleton(){}


    public static StudentSingleton getInstance(){
        if (instance != null) {
            return instance;
        }else {
            instance = new StudentSingleton();
            return instance;
        }
    }




}
