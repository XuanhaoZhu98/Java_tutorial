package com.company.object.person;

public class Engineer extends Person{
    // 派生类/子类
    // 继承是类和类之间的一种关系
    // 子类继承了父类，就会拥有父类的所有方法
    // crtl+h 打开结构图


    public Engineer() {
        // 隐藏代码，调用了父类的无参构造器
        // 调用父类无参构造器，必须在子类构造器的第一行
        super("name");
        System.out.println("No-argument constructor of engineer is being executed.");
    }

    private String name = "Jack";

    public void working(){
        System.out.println("I am doing research.");
    }

    public void test() {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        working();
        this.working();
        super.working();
        // this：本身调用者这个对象。没有继承也可以使用
        // super：代表父类对象，只有在继承条件下才可以使用
    }



}
