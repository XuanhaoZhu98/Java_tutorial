package com.company.array;

public class Demo18 {
    public static void main(String[] args) {
        // 定义，声明了一个数组
        int[] nums;
        // int nums[];  // C语言风格

        // 这里可以存放十个int类型的数字
        nums = new int[10];

        // 将声明和创建同时进行
        // int[] num3 = new int[10]

        // 给数组元素赋值
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }
        // 计算所有元素的和
        int sum = 0;
        // array.lenth可以显示数组长度
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
