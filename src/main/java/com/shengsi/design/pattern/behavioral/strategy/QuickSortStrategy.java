package com.shengsi.design.pattern.behavioral.strategy;

public class QuickSortStrategy implements Strategy {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int p = partition(arr, l, r);
        // 这里是quickSort。。。。
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);

    }

    private int partition(int[] arr, int l, int r) {

        int value = arr[l];

        // arr[l+1...j] < v; arr[j + 1]...i) > v
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < value) {
                swap(arr, i, j + 1);
                j++;
            }
        }
        swap(arr, l, j);
        return j;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25};

        new QuickSortStrategy().sort(arr);

        for (int i : arr) {
            System.out.print(i + ", ");

        }
    }
}
