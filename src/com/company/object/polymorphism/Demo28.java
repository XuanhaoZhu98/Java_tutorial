package com.company.object.polymorphism;

public class Demo28 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // 父类的引用指向子类
        Person s2 = new Student();
        Object s3 = new Student();
        // 对象能执行哪些方法，主要看对象左边的类型，和右边关系不大

        // 子类能调用的方法都是自己的或者是继承父类的
        // 父类可以指向子类，但是不能调用子类独有的方法

        // 子类重写了父类的方法，执行子类的方法
        s2.run();
        s1.run();
        s1.eat();
        ((Student)s2).eat();

        Person p1 = new Person();
        p1.run();


        // 多态是方法的多态，属性没有多态
        // 父类和子类之间必须有联系
        // 存在条件：有继承关系，方法需要重写，父类引用指向子类的对象

        // Object > String
        // Object > Person > Teacher
        // Object > Person > Tutor
        Object p2 = new Student();
        System.out.println(p2 instanceof Student);
        System.out.println(p2 instanceof Person);
        System.out.println(p2 instanceof Object);
        System.out.println(p2 instanceof Tutor);
        System.out.println(p2 instanceof String);
        System.out.println("===========================");
        Person p3 = new Student();
        System.out.println(p3 instanceof Student);
        System.out.println(p3 instanceof Person);
        System.out.println(p3 instanceof Object);
        System.out.println(p3 instanceof Tutor);
        // System.out.println(p3 instanceof String);
        System.out.println("===========================");
        Student p4 = new Student();
        System.out.println(p4 instanceof Student);
        System.out.println(p4 instanceof Person);
        System.out.println(p4 instanceof Object);
        // System.out.println(p4 instanceof Tutor);
        // System.out.println(p4 instanceof String);
        // 类的引用对象如果同级或者没有父子关系则会报错
        // 子类与父类有关，父类与子类无关
        // System.out.println(A instanceof B);
        // 左边是对象，右边是类，当对象是右边类或者子类所创建的对象时候，返回为true，否则为false
        // 当A和B如果同级或者没有父子关系则会报错

        // 类型之间的转换
        // 高              低
        Person s4 = new Student();
        // 从高往低转换需要强制转换
        Student s5 = (Student)s4;
        s5.learn();
        ((Student)s4).learn();;
        // 父类不能直接调用子类的方法，必须强制向下转换后才可以调用子类方法

        Student s6 = new Student();
        Person p5 = s6;
        // 子类转换为父类，可能丢失本来自己的一些方法
        // 父类引用指向子类，可以调用父类公共的方法，还可以调用子类重写的方法，但是无法调用子类独有的方法

        // 把子类转换为父类，向上转型
        // 把父类转换为子类，向下转型，需要强制转换

    }
}
