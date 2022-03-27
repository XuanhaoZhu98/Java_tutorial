package com.company.exception;

public class Test {
    // 可能会存在异常的方法

    static void test(int a) throws MyException {
        System.out.println("The parameter passed is "+a);
        if(a>10){
            throw new MyException(a);
        }
        System.out.println("All done");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
