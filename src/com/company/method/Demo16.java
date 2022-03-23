package com.company.method;

public class Demo16 {
    public static void main(String[] args) {
        printMax(3,4,5,6,7);
        printMax(new double[] {1,2,3,4,5});

    }

    public static void printMax(double... num){
        if(num.length == 0){
            System.out.println("No argument passedd");
        }
        double result = num[0];

        // Order
        for(int i = 1; i < num.length; i++){
            if(num[i] > result){
                result = num[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
