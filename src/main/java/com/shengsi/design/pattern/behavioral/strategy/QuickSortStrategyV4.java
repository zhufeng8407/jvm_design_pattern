package com.shengsi.design.pattern.behavioral.strategy;

import java.util.Random;

public class QuickSortStrategyV4 implements Strategy {
    @Override
    public void sort(int[] arr) {

        quickSortBy3Ways(arr, 0, arr.length - 1);

    }

    private void quickSortBy3Ways(int[] arr, int l, int r) {
        if (l > r)
            return;

        int k = new Random().nextInt(r - l + 1) + l;
        swap(arr, k, l);

        int value = arr[l];
        int lt = l; // arr[l+1...lt] < v
        int gt = r + 1; // arr[gt...r] > v
        int i = l + 1;  // arr[lt+1...i) = v

        while (i < gt) {
            if (arr[i] < value) {
                swap(arr, i, lt + 1);
                lt++;
                i++;
            } else if(arr[i] > value) {
                swap(arr, i, gt - 1);
                gt--;
//                i ++;错误，i不需要动，经过交换i指向的值仍需要比较
            } else {
                i++;
            }

        }

        swap(arr, l, lt);

        quickSortBy3Ways(arr, l, lt-1);
        quickSortBy3Ways(arr, gt, r);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25, 25, 25, 26, 26, 26, 26, 26};

        new QuickSortStrategyV4().sort(arr);

        for (int i : arr) {
            System.out.print(i + ", ");

        }
    }
}
