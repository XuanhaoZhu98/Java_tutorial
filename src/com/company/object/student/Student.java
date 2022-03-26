package com.company.object.student;

public class Student {
    // 属性私有
    private String name;
    private  int id;
    private char gender;
    private  int age;

    // 提供一些可以操作这个属性的方法
    // 提供一些public的get、set方法
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>100 || age<0){
            System.out.println("Wrong age");
        }else {
            this.age = age;
        }

    }
}
