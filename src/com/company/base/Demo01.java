package com.company.base;

public class Demo01 {
    public static void main(String[] args){
        System.out.println("Hello,World!");
        String a = "HelloJAVA";
        System.out.println(a);
        int num1 = 10;
        byte num2 = 2;
        short num3 = 20;
        long num4 = 10000;
        float num5 = 3.3F;
        double num6 = 4.44;
        char name1 = 'A';

        // String不是关键词，是类
        String name2 = "Hello";

        // 进制
        int i1 = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        // 浮点数拓展
        float f1 = 0.1f;
        double d1 = 1.0/10;
        System.out.println(f1==d1);

        float f2 = 1234567889876543f;
        double d2 = f2+1;
        System.out.println(f2==d2);

        // 强制转换
        char c1 = 'a';
        char c2 = '$';    // 所有字符本质都是数字
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);

        char c3 = '\u0061';
        System.out.println(c3);

        // 转义字符
        System.out.println("Hello\tJAVA\nILove");

        // 内存上的一些问题
        String sa = new String("Hello") ;
        String sb = new String("Hello") ;
        String sc = "Hello";
        String sd = "Hello";
        System.out.println(sa==sb);
        System.out.println(sc==sd);

        // 布尔值索引
        boolean flag = true;
        if(flag){
            System.out.println("Code needs to be compact and easy to read");
        }
    }
}
