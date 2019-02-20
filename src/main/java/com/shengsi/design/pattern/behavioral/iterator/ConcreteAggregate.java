package com.shengsi.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> values = new ArrayList<>();

    private int currentIndex = 0;

    @Override
    public MyIterator<T> createIterator() {
        return new ConcreteIterator<T>(this);
    }

    @Override
    public void add(T t) {
        values.add(t);
    }


    public T next() {
        return values.get(currentIndex++);
    }

    public boolean hasNext() {
        return currentIndex < values.size();
    }

    public T first() {

        return values.get(0);
    }

    public T currentItem() {
        return values.get(currentIndex);
    }

}
