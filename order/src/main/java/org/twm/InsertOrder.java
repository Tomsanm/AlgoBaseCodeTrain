package org.twm;

public class InsertOrder {

    public static void main(String[] args) {
        int[] x = {7,9,1,2,3,0};
        insertOrder(x);
    }

    private static void insertOrder(int[] x){
        for (int i = 1; i < x.length; i++) {
            // 摸牌
            int temp = x[i];
            // 比较插入
            for (int j = i; ; j++) {
                // 如果小于这之前的值，和他换位置，用新的temp继续比
                if (temp<x[j]) {
                    temp = int[]

                }

            }


        }

    }


}
