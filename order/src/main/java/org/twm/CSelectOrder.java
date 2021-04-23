package org.twm;

import static org.twm.APopOrder.showResult;

public class CSelectOrder {
    public static void main(String[] args) {
        int[] x = {0,7,9,2,3,1,19,13};
        selectOrder(x);
        showResult(x);
    }

    /**
     * 反复--从第一个位置开始，每次都从剩余的元素中找到最小的
     * @param x
     */
    private static void selectOrder(int[] x) {
        for (int i = 0; i <x.length-1; i++) {
            int min = x[i];
            for (int j = i; j < x.length-1; j++) {
                if (min>x[j+1]) {
                    int temp = min;
                    min = x[j+1];
                    x[j+1] =temp;
                }
            }
            x[i] = min;
        }
    }
}
