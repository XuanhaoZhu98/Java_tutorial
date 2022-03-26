package com.company.object.app;

public class Application {
    public static void main(String[] args) {
        // 一个项目应该只有一个main方法
        // 类是抽象的，需要实例化
        Student xuanhao = new Student();
        // 类实例化之后会返回一个自己的对象
        // 对象就是一个类的实例化。或者说类实例化以后是一个对象
        // 使用new关键词创建对象的时候。除了分配内存空间外，还会给创建好的对象进行默认的初始化
        // 以及对类中构造器的调用
        System.out.println(xuanhao.name);
        System.out.println(xuanhao.age);
        xuanhao.name = "zxh";
        xuanhao.age =23;
        // 一个类可以被实例化出多个对象，对象之间没有关联
        // 以类的方式组织代码，以对象的方式组织数据

        // 使用new关键字，本质在调用构造器
        // 用来初始化值
        Course math = new Course("Math");
        System.out.println(math.name);

        Pet jack = new Pet();
        jack.age = 3;
        jack.name = "Jack Wood";
        jack.braking();



    }
}
