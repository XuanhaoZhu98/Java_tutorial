package com.company.object.inherit;

public class Demo27 {
    public static void main(String[] args) {
        A oa = new A();
        oa.test1();

        // 子类重写了父亲的方法
        B ob = new A();
        ob.test1();

        A.test2();
        B.test2();

        // 静态方法和非静态方法区别很大
        // 静态方法是类的方法，而非静态方法是对象的方法
        // 有static时候，b调用了B类的方法，以为b是用B类定义的
        // 没有static时候，b调用的是对象的方法，而b是用A类new的

        // 重写产生于父类和子类之间，是指子类将父类的方法进行重写
        // 重载是指同一个类中，可以因不同的参数类型，参数个数等写出多个相同名字的方法

        // 重写方法名必须相同
        // 重写参数列表必须相同
        // 修饰符范围可以扩大但不能缩小
        // 抛出的异常范围可以被缩小但不能被扩大
    }
}
