package com.shengsi.design.pattern.behavioral.strategy;

public class BubbleSortStrategy implements Strategy {

    @Override
    public void sort(int[] arr) {

        boolean isSorted = false;
        for (int i = 0; i < arr.length - 1; i++) {

            isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSorted = false;
                }
            }

            if(isSorted)
                return;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,7,9,3,1,2};

        new BubbleSortStrategy().sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
    }

}
