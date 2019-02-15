package com.shengsi.design.pattern.behavioral.strategy;

public class InsertionSortStrategy implements Strategy {

    @Override
    public void sort(int[] arr) {
        insertionSort(arr, 0, arr.length - 1);
    }

    public static void insertionSort(int[] arr, int l, int r) {

        for (int i = l; i <= r; i++) {

            for (int j = i; j > l; j--) {
                if (arr[j] < arr[j - 1])
                    swap2(arr, j, j - 1);
                else
                    break;
            }

        }
    }

    private static void swap2(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25};

        new InsertionSortStrategy().sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }
}
