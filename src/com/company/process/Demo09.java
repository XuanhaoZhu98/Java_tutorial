package com.company.process;

public class Demo09 {
    public static void main(String[] args) {
        char score = 'A';
        // switch也可以支持字符串
        switch (score) {
            case 'A':
                System.out.println("First");
                break;
            case 'B':
                System.out.println("Second");
                break;
            case 'C':
                System.out.println("Third");
                break;
            case 'D':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Wrong");
        }

    }
}
