package com.company.process;

public class Demo10 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(i < 10){
            System.out.println("This is " + i + " times");
            i++;
            sum += i;
            System.out.println("This sum is " + sum);
        }

        // do while保证循环体至少执行一次
        // 先执行再判断
        int j = 0;
        int sum2 = 0;
        do{
            sum2 += j;
            j++;
            System.out.println("This sum is " + sum2);
        }while (j < 10);
    }
}
