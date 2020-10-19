package com.mwt.sort;

public class ShellSort extends SortCalculator implements ISort {
    private static final int DEFAULT_GAP = 1;

    @Override
    public int[] sort(int[] arr) {
        return shellSort(arr);
    }

    private int[] shellSort(int[] arr) {
        int gap = calculateGap(arr);
        for (; gap > 0; gap /= 2) {
            insertSort(arr, gap);
        }
        return arr;
    }

    private int[] insertSort(int[] arr, int gap) {
        int len = arr.length;
        for (int i = 0; i + gap < len; i += gap) {
            int j = i;
            int tmp = arr[j + gap];
            while (true) {
                if (arr[j] <= tmp) {
                    arr[j + gap] = tmp;
                    break;
                }
                arr[j + gap] = arr[j];
                j -= gap;
                if (j < 0) {
                    arr[0] = tmp;
                    break;
                }
            }
        }
        return arr;
    }

    private static int calculateGap(int[] arr) {
        int len = arr.length;
        if (len < 100) {
            return len;
        } else {
            return DEFAULT_GAP;
        }
    }
}
