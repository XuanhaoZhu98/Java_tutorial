package com.company.object.abstractclass;

// 抽象类只是一种约束，没有实现
// 抽象类不可以new，只能让子类来实现

public abstract class Action {
    public abstract void doSomething();
    // 抽象方法只有方法名字，没有方法的实现
    // 抽象方法必须在抽象类中
    // 抽象方法是指在创造这个方法的时候不确定这个方法具体怎么去实现，于是交给想去实现此接口的人重写

    // 抽象类可以存在普通方法
    // 构造方法也是普通方法的一种，抽象类可以有构造器

    public  void run(){
        System.out.println("This is a methon");
    }
}
