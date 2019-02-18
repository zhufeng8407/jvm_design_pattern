package com.shengsi.design.pattern.behavioral.strategy;

import java.util.Random;

public class QuickSortStrategyV3 implements Strategy {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int l, int r) {
        if (l >=r )
            return;
        int p = partition(arr, l, r);

        quickSort(arr, 0, p-1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int[] arr, int l, int r) {
        int k = new Random().nextInt(r - l + 1) + l;
        swap(arr, k, l);
        int value = arr[l];

        int i = l + 1;
        int j = r;

        while(true) {

            while(i <= r && arr[i] < value) i++;
            while(j >= l + 1 && arr[j] > value) j--;
            if (i > j) break;   // 注意必须放下面
            swap(arr, i, j);
            i++;
            j--;
        }

        swap(arr, l, j);
        return j;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25, 25, 25, 26, 26, 26, 26, 26};

        new QuickSortStrategyV3().sort(arr);

        for (int i : arr) {
            System.out.print(i + ", ");

        }
    }
}
