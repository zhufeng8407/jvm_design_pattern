package com.shengsi.design.pattern.behavioral.strategy;

import java.util.Random;

public class QuickSortStrategyV2 implements Strategy {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int l, int r) {

        if (l >= r)
            return;
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int[] arr, int l, int r) {

        int k = new Random().nextInt(r - l + 1) + l;
        swap(arr, k, l);
        int value = arr[l];

        int j = l;

        for (int i = l; i <= r; i++) {
            if (arr[i] < value) {
                swap(arr, j, i);
                j++;
            }
        }

        swap(arr, l, j);
        return j;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25};

        new QuickSortStrategyV2().sort(arr);

        for (int i : arr) {
            System.out.print(i + ", ");

        }
    }
}
