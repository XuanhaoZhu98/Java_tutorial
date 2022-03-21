package com.company.base;

public class Demo03 {
    static int allClicks = 0;    // 类变量
    static double salary = 20000;
    // 布尔值为false
    // 其他值为null
    // main方法，主程序方法
    String name;    // 实例变量：从属于对象，如果不进行初始化，默认值就为 0 0.0
    int age;    // 实例变量

    static final int MAX = 512;
    final static  int MIN =16;    // 修饰符不存在前后顺序

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;    // 注意程序可读性，尽量不要写在一起
        String s = "xuanhao";    // 局部变量：必须声明和初始化值

        // 如何使用实例变量
        Demo03 demo03 = new Demo03();    // alt+enter先实例化一个类
        System.out.println(demo03.age);
        System.out.println(demo03.name);
        System.out.println(salary);

        // 常量
        final double PI = 3.1415926;
    }

    // 其他方法
    public  void add(){

    }
}
