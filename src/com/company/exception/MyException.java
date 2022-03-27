package com.company.exception;

// 自定义的异常类

public class MyException extends Exception {
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    // 异常的打印信息

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
