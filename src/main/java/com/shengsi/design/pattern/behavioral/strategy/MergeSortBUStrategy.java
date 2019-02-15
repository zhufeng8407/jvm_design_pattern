package com.shengsi.design.pattern.behavioral.strategy;

public class MergeSortBUStrategy implements Strategy {
    @Override
    public void sort(int[] arr) {
        mergeSortBU(arr, 0, arr.length );
    }

    private void mergeSortBU(int[] arr, int l, int r) {

        for (int sz = 1; sz <= r; sz += sz) {
            for (int i = 0; i + sz < r; i += sz + sz) {
                merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, r - 1));
            }
        }

    }

    private void merge(int[] arr, int l, int mid, int r) {

        // 先复制一份
        int[] aux = new int[r - l + 1];
        for (int i = l; i <= r; i++)
            aux[i - l] = arr[i];

        int left = l;
        int right = mid + 1;

        for (int k = l; k <= r; k++) {

            if (left > mid)
                arr[k] = aux[right++ - l];
            else if (right > r)
                arr[k] = aux[left++ - l];
            else if (aux[left - l] > aux[right - l])
                arr[k] = aux[right++ - l];
            else
                arr[k] = aux[left++ - l];
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25};

        new MergeSortBUStrategy().sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }
}
