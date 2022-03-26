package com.company.object.staticanalysis;
import static java.lang.Math.random;

public class Persom {
    {
        // 代码块（匿名代码块）
        System.out.println("Anonymous code block");
    }

    static {
        // 静态代码块
        System.out.println("Static code block");
    }

    public Persom() {
        System.out.println("Construction method");
    }

    public static void main(String[] args) {
        Persom p1 = new Persom();
        System.out.println("====================");
        Persom p2 = new Persom();
        // 静态代码块只执行一次

        System.out.println(random());


    }
}
