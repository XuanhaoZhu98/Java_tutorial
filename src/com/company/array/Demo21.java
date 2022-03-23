package com.company.array;

import java.util.Arrays;

public class Demo21 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,8,7,6,5,4};
        // 打印出Hash code
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        // 排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // 填充数组
        Arrays.fill(a, 0);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 2,4,0);
        System.out.println(Arrays.toString(a));
    }
}
