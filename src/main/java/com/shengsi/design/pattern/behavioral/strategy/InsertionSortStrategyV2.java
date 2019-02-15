package com.shengsi.design.pattern.behavioral.strategy;

public class InsertionSortStrategyV2 implements Strategy {

    @Override
    public void sort(int[] arr) {
        insertionSort(arr, 0, arr.length - 1);
    }

    public static void insertionSort(int[] arr, int l, int r) {

        for (int i = l; i <= r; i++) {
            int value = arr[i];

            int j = i;

            for (j = i; j > l && (arr[j - 1] > value); j--) {
                arr[j] = arr[j -1];
            }

            arr[j] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25};

        new InsertionSortStrategyV2().sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }
}
