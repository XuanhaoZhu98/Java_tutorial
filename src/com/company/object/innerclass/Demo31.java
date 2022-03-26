package com.company.object.innerclass;

public class Demo31 {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Inner i1 = o1.new Inner();
        i1.in();
        o1.out();

        // 没有名字初始化类，不用将实例保存到变量中
        new A().run();

        new Hello(){
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
    }
}

interface Hello{
    void sayHello();
}
