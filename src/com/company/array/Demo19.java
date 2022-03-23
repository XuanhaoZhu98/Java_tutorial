package com.company.array;

public class Demo19 {
    public static void main(String[] args) {
        // 静态初始化，创建+赋值
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(a[0]);

        // 动态初始化：包含默认初始化
        int[] b = new int[10];
        b[0] = 5;
        b[1] = 5;

        for (int i = 0; i < 10; i++) {
            System.out.println(b[i]);
        }

        // 遍历数组简单写法
        for(int i : b){
            System.out.println(i);
        }

        printArray(a);

        int[] result = new int[10];
        result = reverse(a);
        printArray(result);

    }

    // 打印数组
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    // 反转数组
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for (int i = 0, j = result.length-1; i < array.length ; i++, j--) {
            result [j] = array[i];
        }
        return result;
    }
}
