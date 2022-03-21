package com.company.base;

public class Demo02 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;    // byte最多127，这边造成了内存溢出
        // (类型)变量名叫做强制转换
        System.out.println(i);
        System.out.println(b);
        double c = i;
        System.out.println(c);
        // 从高到低强制转换
        // 从低到高自动转换
        /*
        1. 不能对布尔类型进行转换
        2. 不能把对象类型转换为不相干类型
        3. 把高容量转换到低容量的时候，需要强制转换
        4. 转换的时候可能存在内存溢出或者精度问题
         */

        System.out.println((int)23.7);
        System.out.println((int)-23.78f);

        char d = 'a';
        int e = d+1;
        System.out.println(e);
        System.out.println((char)e);

        int money = 10_000_000;
        int year = 2000;
        int total = money*year;
        long total2 = money*year;
        System.out.println(total);    // 计算时候溢出
        System.out.println(total2);    // 转换之前已经溢出了
        long total3 = money*(long)year;
        System.out.println(total3);    // 计算的时候提升了类型


    }
}
