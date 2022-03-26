package com.company.object.polymorphism;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("Son is running.");
    }

    public void eat(){
        System.out.println("Son is eating");
    }

    public void learn(){
        System.out.println("Student is learning");
    }
}
