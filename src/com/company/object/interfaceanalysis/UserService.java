package com.company.object.interfaceanalysis;

public interface UserService {
    // 接口中的所有定义都是抽象的
    // 接口是一种约束
    // 定义一些方法，让不同的人去实现
    // 接口不能被实例化，接口中没有构造方法
    // implements可以实现多个接口
    // 必须要重写接口中的方法

    void add(String name);
    void delete(String name);
    void updated(String name);
    void quaey(String name);

    int age = 23;
    public static final String name = "zxh";
}
