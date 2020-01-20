package com.example.ecommerceapp;


public class Student {

    private String name;
    private int rollNumber;
    private String address;
    private String cgpa;


    private static String asjhdjkash;


    public Student(String name, int rollNumber, String address, String cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        this.cgpa = cgpa;
    }

    public static class StudentBuilder{


        private String name;
        private int rollNumber;
        private String address;
        private String cgpa;



        public StudentBuilder addName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder addRollnumber(int rollNumber){
            this.rollNumber = rollNumber; return this;
        }

        public StudentBuilder addAddress(String address){
            this.address = address;return this;
        }


        public StudentBuilder addCGPA(String cgpa){
            this.cgpa = cgpa;return this;
        }

        public Student build(){
            Student s = new Student(this.name , this.rollNumber, this.address , this.cgpa);
            return s;
        }


    }
}
