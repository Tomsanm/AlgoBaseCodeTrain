package org.twm;

public class PopOrder {
    /**
     * pop
     */

    public static void main(String[] args) {
        int[] x = {7,9,1,2,3,0};
        popOrder(x);
//        showResult(x);
        for (int i = 10; i >=0 ; --i) {
            System.out.println(i);

        }
    }

    private static void popOrder(int[] inputArray){
        for (int i = inputArray.length-1; i>=0; i--) {
            boolean swapFlag = false;
            for (int j = 0; j < i ; j++) {
                if (inputArray[j]>inputArray[j+1]) {
                    swap(inputArray,j);
                    swapFlag = true;
                }
            }
            if (!swapFlag) {
                break;
            }
        }
    }

    /**
     * 数组元素前后交换方法
     * @param inputArray
     * @param j
     */
    private static void swap(int[] inputArray,int j){
        int temp = inputArray[j];
        inputArray[j] = inputArray[j+1];
        inputArray[j+1] = temp;
    }

    private static void showResult(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
