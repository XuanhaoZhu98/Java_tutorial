package com.company.process;

import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s = stdin.nextLine();

        // equal判断字符串是否相等
        if (s.equals("Hello")){
            System.out.println("Good");
        }else{
            System.out.println("Wrong");
        }

        // 成绩分类
        System.out.println("Please enter your score:");
        if (stdin.hasNextInt()){
            int score = stdin.nextInt();
            if (score > 70){
                System.out.println("First level");
            }else if(score < 70 && score >60){
                System.out.println("Second level");
            }else if(score < 60 && score > 50){
                System.out.println("Third level");
            }else {
                System.out.println("Failed");
            }
        }


        stdin.close();
    }
}
