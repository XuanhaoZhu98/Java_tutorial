package com.company.object.app;

public class Course {
    // 一个类即使什么都不写，也会存在一个方法

    String name;
    int id;

    // 显示的定义一个构造器
    public Course(){
        this.name = "Math";
    }

    // 有参构造
    // 一旦定义了有参构造，无参都必须显式定义
    public Course(String name){
        this.name = "LinerMath";
    }
    // alt+INS用来生成构造器

    public Course(int id) {
        this.id = id;
    }

    // 构造器必须和类名相同
    // 构造器没有返回值
}
