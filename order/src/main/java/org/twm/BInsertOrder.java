package org.twm;

import static org.twm.APopOrder.showResult;

public class BInsertOrder {

    public static void main(String[] args) {
        int[] x = {7,1,9,2,3,0,19,13};
        insertOrder(x);
        showResult(x);
    }

    /** 插入排序
     * 反复-从第二个元素开始，每个倒小循环中依次换位置，使用循环截止条件把操作的元素放到正确的位置。
     * @param x
     */
    private static void insertOrder(int[] x){
        for (int i = 1; i < x.length; i++) {
            // 摸牌
            int temp = x[i];
            // 比较插入
            for (int j = i; j>0 && temp<x[j-1]; j--) {  // 这种情况说明本次排序结束
                // 如果小于这之前的值，和他换位置，用新的temp继续比
                x[j] = x[j-1];
                x[j-1] = temp;
            }
        }
    }


}
