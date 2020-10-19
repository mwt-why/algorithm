package com.mwt.sort;

/**
 * 冒泡排序算法
 */
public class BubbleSort extends SortCalculator implements ISort {

    @Override
    public int[] sort(int[] arr) {
        return bubbleSort(arr);
    }

    private int[] bubbleSort(int[] arr) {
        int len = arr.length;
        int tmp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
