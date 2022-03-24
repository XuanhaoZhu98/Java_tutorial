package com.company.array;

import java.util.Arrays;

public class Demo22 {
    public static void main(String[] args) {
        // 冒泡排序
        // 比较数组中两个相邻的元素，如果第一个数比第二个数大，就交换他们的位置
        int[] a = {4,8,12,65,33,98,42,18,2,27,71};
        a =bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] bubbleSort(int[] array){
        // 外层循环，判断需要运行多少次
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            // 通过flag标识位减少没有意义的比较
            boolean flag = false;
            // 内层循环，比较两个数的大小
            for (int j = 0; j < array.length-i; j++){
                if(array[j+1] < array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
        return array;
    }
}

