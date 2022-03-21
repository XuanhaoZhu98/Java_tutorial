package com.company.process;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        // 创建一个扫描器对象，用于接收键盘数据
        Scanner stdin = new Scanner(System.in);

        System.out.println("请输入不带空格的字符串，使用next方法接收");
        // 判断用户有没有输入字符
        if (stdin.hasNext()) {
            String str1 = stdin.next();
            System.out.println("输出的内容为：" + str1);
        }
        // 凡是属于IO流的类如果不关闭会一直占用资源，要养成好习惯用完就关掉
        // scanner.close();

        System.out.println("请输入任意字符串，使用nextLine方法接收");
        // 判断是否还有输入
        if(stdin.hasNextLine()) {
            String str2 = stdin.nextLine();
            System.out.println("输出的内容为：" + str2);
        }
        // scanner.close();

        System.out.println("请输入字符串：");
        String str3 = stdin.nextLine();
        System.out.println("你输入的内容为："+ str3);

        // 接收整数
        int a = 0;


        System.out.println("请输入整数：");
        if(stdin.hasNextInt()) {
            a = stdin.nextInt();
            System.out.println("你输入的整数为："+ a);
        }else{
            System.out.println("你输入的不是整数");
        }

        // 接收浮点数
        float b = 0.0f;
        System.out.println("请输入浮点数：");
        if(stdin.hasNextFloat()) {
            b = stdin.nextFloat();
            System.out.println("你输入的浮点数为："+ b);
        }else{
            System.out.println("你输入的不是浮点数");
        }

        stdin.close();
    }
}
