package com.company.exception;

public class Demo32 {
    public static void main(String[] args) {

        // System.out.println(11/0);

        int a = 1;
        int b = 0;
        // ctrl+alt+T 增加代码包裹快捷键

        // 如果需要补货多个异常，需要从小到大
        try {
            if(b==0){
                throw new ArithmeticException();
                // 主动抛出异常
            }
            System.out.println(a/b);
        }catch (Exception e) {
            // catch参数是想要捕获的异常类型
            System.out.println("Divide by zero");
        }catch (Throwable t){
            System.out.println("Serious error");
        } finally {
            // finally处理善后工作，也可以不需要
            System.out.println("Finally");
        }
    }

    // 假设这个方法中处理不了这个异常，方法向上抛出异常

    public void test(int a, int b) throws Exception {
        if(b == 0){
            throw new IllegalArgumentException();
        }
    }
}
