package com.company.object.staticanalysis;

public class Student {
    private static int age;
    private double score;

    public void study(){
        System.out.println("Studying");
        eat();
    }

    public static void eat(){
        System.out.println("Eating");
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);
        // 静态方法只能调用静态成员变量，此时的score是非静态的
        Student.eat();
        s1.eat();
        s1.study();
        // 被static修饰的方法或变量都是随着类的加载的时候就加载了的，所以不需要new对象就可以使用

    }
}
