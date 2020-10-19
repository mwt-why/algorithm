package com.mwt.sort;

/**
 * 计算排序时间用
 * 这其实是一种aop思想
 */
public abstract class SortCalculator implements ISort {

    public int[] calculate(int[] arr) {
        long start = System.currentTimeMillis();
        int[] sortedArr = sort(arr);
        long end = System.currentTimeMillis();
        takes((end - start));
        return sortedArr;
    }

    private void takes(long millis) {
        long take = millis / 1000;
        if (this instanceof BubbleSort) {
            System.out.println(BubbleSort.class.getSimpleName() + " takes: " + take);
        } else if (this instanceof InsertSort) {
            System.out.println(InsertSort.class.getSimpleName() + " takes: " + take);
        } else if (this instanceof ShellSort) {
            System.out.println(ShellSort.class.getSimpleName() + " takes: " + take);
        }
    }

    public static int[] sort(ISort sort, int[] arr) {
        int[] sortedArr = null;
        if (sort instanceof SortCalculator) {
            SortCalculator calculator = (SortCalculator) sort;
            sortedArr = calculator.calculate(arr);
        }
        return sortedArr;
    }
}
