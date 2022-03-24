package com.company.array;

public class Demo23 {
    public static void main(String[] args) {
        // 创建一个二维数组
        int[][] a = new int[11][11];
        a[1][2] = 1;
        a[2][3] = 1;
        a[5][3] = 2;
        System.out.println("The original array is:");
        for(int[] i:a){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        System.out.println("==================================");
        // 获取有效值的个数
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++){
                if(a[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("The number of valid values is "+sum);

        // 创建稀疏数组
        int[][] sparseArray = new int[sum+1][3];
        sparseArray[0][0] = a.length;
        sparseArray[0][1] = a[0].length;
        sparseArray[0][2] = sum;

        // 遍历原始二维数组，将非零的数值存放于稀疏数组中
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++){
                if(a[i][j]!=0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = a[i][j];
                }
            }
        }

        // 输出稀疏数组
        System.out.println("==================================");
        System.out.println("The sparse array is:");
        for(int[] i:sparseArray){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        System.out.println("==================================");
        // 还原稀疏数组
        int[][] unpackedArray = new int[sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            unpackedArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];

        }
        System.out.println("The unpacked array is:");
        for(int[] i:a){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
