package com.mwt.sort;

/**
 * 插入排序法
 */
public class InsertSort extends SortCalculator implements ISort {
    @Override
    public int[] sort(int[] arr) {
        return insertSort(arr);
    }

    private int[] insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int tmp = arr[i + 1];
            int j = i;
            while (true) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                    if (j == -1) {
                        arr[0] = tmp;
                        break;
                    }
                } else {
                    arr[j + 1] = tmp;
                    break;
                }

            }
        }
        return arr;
    }
}
