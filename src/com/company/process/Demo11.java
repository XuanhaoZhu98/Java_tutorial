package com.company.process;

public class Demo11 {
    public static void main(String[] args) {
        // 初始化值 // 条件判断 // 迭代
        for (int i = 0; i < 100; i++){
            System.out.println("This is " + i + " times.");
        }
        System.out.println("The for cycle is over");
        // 100.for 可以快速输入

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                oddSum += i;
            }else {
                evenSum += i;
            }
        }
        System.out.println(oddSum+"//"+evenSum);

        for (int i = 0; i < 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if(i%(5*3)==0){
                System.out.println();
                // System.out.print("\n");
                // println输出完会换行
                // print输出完不会换行
            }
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if(j<=i){
                    System.out.print(j+"*"+i+"="+i*j+"\t");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

        int[] num = {10,20,30,40,50};

        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
        System.out.println("===============");
        for (int x : num){
            System.out.println(x);
        }

    }
}
