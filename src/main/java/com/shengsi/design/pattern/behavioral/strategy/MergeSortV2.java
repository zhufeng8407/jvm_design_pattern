package com.shengsi.design.pattern.behavioral.strategy;

public class MergeSortV2 {
    
    public void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        
        int mid = (r + l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        if (arr[mid] > arr[mid + 1])
            partition(arr, l, mid, r);
    }

    private void partition(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r - l + 1];

        for (int i = l; i <= r; i++) {
            aux[i - l] = arr[i];
        }

        int length = l;
        int right = mid + 1;

        for (int k = l; k <= r; k++) {
            if (length > mid) {
                arr[k] = aux[right++ - l];
            } else if (right > r) {
                arr[k] = aux[length++ - l];
            } else if (aux[length - l] > aux[right - l]) {
                arr[k] = aux[right++ - l];
            } else {
                arr[k] = aux[length++ - l];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25};

        new MergeSortV2().mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }
}
