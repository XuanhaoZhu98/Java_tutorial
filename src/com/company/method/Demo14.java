package com.company.method;

public class Demo14 {
    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);
        test();
    }
    
    public static int add(int a, int b) {
        return (a + b);
    }
    
    public static void test(){
        for (int i = 0; i < 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if(i%(5*3)==0){
                System.out.println();
            }
        }
    }

    // 返回较大值
    public  static int max(int num1, int num2){
        int result = 0;
        if(num1==num2){
            System.out.println("They are same.");
            // return 0 可以结束方法
            return 0;
        }
        if(num1>num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }

    // 方法的重载
    public  static float max(float num1, float num2){
        float result = 0;
        if(num1==num2){
            System.out.println("They are same.");
            // return 0 可以结束方法
            return 0;
        }
        if(num1>num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }
}
