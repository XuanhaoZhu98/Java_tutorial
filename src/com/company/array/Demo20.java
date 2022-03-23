package com.company.array;

public class Demo20 {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4},{5,6}};
        int[][] b = new int[10][10];
        System.out.println(a[0][0]);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
