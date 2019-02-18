package com.shengsi.design.pattern.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] arr) {
        this.strategy.sort(arr);
    }

    public void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");

        }
    }
}
