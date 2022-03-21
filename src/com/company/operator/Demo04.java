package com.company.operator;

public class Demo04 {
    public static void main(String[] args) {
        // ctrl+D 复制当前行到下一行
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);

        // 类型提升 type promotion
        long e = 123456789L;
        int f = 123;
        short g = 12;
        byte h = 1;
        System.out.println(e+f+g+h);    // long
        System.out.println(f+g+h);    // int
        System.out.println(g+h);    // int; short, byte and char不转换，默认转换成int

        // 自增和自减
        int i = 1;
        int j = i++;    // 赋值完再自增
        int k = ++i;    // 自增完再赋值

        // 幂运算，需要额外的的包
        double pow = Math.pow(2,3);
        System.out.println(pow);

        // 逻辑运算符
        boolean l = true;
        boolean m = false;
        System.out.println(l&&m);
        System.out.println(l||m);
        System.out.println(!m);

        // 字符串连接符
        int n = 10;
        int o = 20;
        System.out.println(n+o+"");
        System.out.println(""+n+o);

        // 三元运算符
        int score = 50;
        String level = score<40 ? "failed":"pass";
        System.out.println(level);

    }
}
