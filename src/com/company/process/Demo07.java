package com.company.process;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        // 输入多个数字，并求其总和和平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner stdin = new Scanner(System.in);

        // 储存和的变量
        double sum = 0.0;
        // 统计输入多少字符的变量
        int m = 0;

        System.out.println("请输入一些数");
        // 通过循环判断是否还有输入，并且对每一次输入进行求和统计
        while (stdin.hasNextDouble()) {
            double x = stdin.nextDouble();
            m++;
            sum += x;
            System.out.println("你输入了第"+m+"个数据"+"当前的累计和为:"+sum);
        }
        System.out.println(m+"个数的总和为"+sum);
        System.out.println(m+"个数的平均数为"+(sum/m));
        stdin.close();
    }
}
