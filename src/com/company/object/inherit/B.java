package com.company.object.inherit;

// 重写都是方法的重写，和属性无关

public class B {
    public void test1(){
        System.out.println("Btest non-static");
    }

    public static void test2(){
        System.out.println("Btest static");
    }
}
