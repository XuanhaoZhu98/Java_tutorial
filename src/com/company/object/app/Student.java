package com.company.object.app;

// 学生类
public class Student {
    // 属性：字段
    String name;
    int age;

    public void study(){
        System.out.println(this.name+" is studying");
        // 一旦我们new了一个对象，那么对象中的每个成员方法中都存在一个特殊的对象应用‘this。
        // 成员方法属于那个对象，那么$this就代表哪个对象
    }
}
