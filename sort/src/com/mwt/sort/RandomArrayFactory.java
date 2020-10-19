package com.mwt.sort;

import java.util.Random;

/**
 * 随机无序，倒序数组生成工厂
 *
 * */
public class RandomArrayFactory {
    private static final int DEFAULT_SIZE = 20;
    private static final Random random = new Random();

    public static int[] newInstance() {
        return newInstance(DEFAULT_SIZE);
    }

    public static int[] newInstance(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int n = random.nextInt(size);
            arr[i] = n;
        }
        return arr;
    }

    public static int[] getReArray() {
        return getReArray(DEFAULT_SIZE);
    }

    public static int[] getReArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }
}
