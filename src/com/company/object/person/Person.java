package com.company.object.person;

public class Person {
    // 父类
    // 四个修饰符：public, protected, default, private
    // 在JAVA中，所有的类都默认基础object类


    public Person() {
        System.out.println("No-argument constructor of person is being executed.");
    }

    public Person(String name) {
        System.out.println("Argument constructor of person is being executed.");
    }

    public void saying(){
        System.out.println("Hello");
    }
    public int age;
    public char gander;
    private int money = 1000000;
    protected String name = "Daniel";

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void working(){
        System.out.println("I am working.");
    }
}
