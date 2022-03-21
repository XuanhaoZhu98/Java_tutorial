package com.company.process;

public class Demo12 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            System.out.println(i);
            i++;
            if(i > 30){
                break;
            }
        }
        i = 0;
        while (i < 100) {
            i++;
            if(i%10==0){
                System.out.println();
                continue;
            }
            // 所有10的倍数都没有被打印，跳过循环体剩下的语句执行下一次循环判断
            System.out.print(i);
        }

        // 类似于goto的标签
        // 输出101-150之间的所有质数
        outer:for (i = 101; i < 150; i++) {
            for (int j = 2; j < i/2; j++){
                if(i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i+" ");
        }
    }
}
