package com.shengsi.design.pattern.behavioral.strategy;

public class MergeSortStrategy implements Strategy {

    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int mid = (l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        // 关键的地方    merge
        merge(arr, l, mid, r);
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
            else if (aux[left - l] < aux[right - l])
                arr[k] = aux[left++ - l];
            else
                arr[k] = aux[right++ - l];
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2};

        new MergeSortStrategy().sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }
}
