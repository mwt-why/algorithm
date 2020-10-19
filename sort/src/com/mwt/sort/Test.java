package com.mwt.sort;

import java.util.Arrays;

public class Test {
    private static final int SIZE = 200000;

    private static void getArrays() {
        int[] ints = RandomArrayFactory.newInstance();
        System.out.println(Arrays.toString(ints));
    }

    private static int[] randomMode(ISort sort) {
        ISort iSort = sort;
        int[] arr = RandomArrayFactory.newInstance(SIZE);
        SortCalculator.sort(iSort, arr);
        return arr;
    }

    private static int[] reSortMode(ISort sort) {
        ISort iSort = sort;
        int[] arr = RandomArrayFactory.getReArray();
        SortCalculator.sort(iSort, arr);
        return arr;
    }

    private static void bubbleSort() {
        randomMode(new BubbleSort());
    }

    private static void insertSort() {
        randomMode(new InsertSort());
    }


    private static void shellSort() {
        randomMode(new ShellSort());
    }

    private static void shellSortRMode(){
        int[] sortedArr = reSortMode(new ShellSort());
        System.out.println(Arrays.toString(sortedArr));
    }

    public static void main(String[] args) {
//        getArrays();
//        bubbleSort();
        insertSort();
//        test();
//        copyArray();
//        shellSort();
//        shellSortRMode();
    }

    private static class Account {
        private int id;

        public Account(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "id=" + id +
                    '}';
        }
    }

    private static void test() {
        Account account = new Account(1);
        Account tmp = account;
        account.setId(2);
        System.out.println(tmp);
    }

    private static void copyArray() {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        arr[0] = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
