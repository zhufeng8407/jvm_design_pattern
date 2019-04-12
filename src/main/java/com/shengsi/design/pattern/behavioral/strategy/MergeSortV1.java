package com.shengsi.design.pattern.behavioral.strategy;

public class MergeSortV1 {



    public void mergeSort(int[] arr, int l, int r) {

        if (l >= r)
            return;
//        int mid = (r - l )/2;

        int mid = (r + l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1,  r);

        partition(arr, l, mid + 1, r);


    }

    private void partition(int[] arr, int l, int mid, int r) {

        // copy
        int[] aux = new int[r - l + 1];
        for (int j = 0; j < aux.length; j++)
            aux[j] = arr[l + j];

        int left = l;
        int right = mid;
        for (int k = l; k <= r; k++) {
            if (left > mid) {
                arr[k] = aux[right++ - l];
            } else if (right > r) {
                arr[k] = aux[left++ - l];
            } else if (aux[left - l] < aux[right - l]) {
                arr[k] = aux[left++ - l];
            } else {
                arr[k] = aux[right++ - l];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25};

        new MergeSortV1().mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }
}
