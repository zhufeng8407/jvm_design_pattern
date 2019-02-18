package com.shengsi.design.pattern.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        int[] arr = new int[]{4,7,9,3,1,2,12,11,19,87,21,29,39,37,25,33,25, 25, 25, 26, 26, 26, 26, 26};

        context.setStrategy(new QuickSortStrategyV4());
        context.sort(arr);

        context.display(arr);
    }
}
