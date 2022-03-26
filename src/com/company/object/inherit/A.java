package com.company.object.inherit;

// 继承

public class A extends B{
    @Override
    public void test1() {
        System.out.println("Atest  non-static");
    }

    public static void test2(){
        System.out.println("Atest static");
    }
}
