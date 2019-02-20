package com.shengsi.design.pattern.behavioral.iterator;

public interface MyIterator<T> {

    T next();

    boolean hasNext();

    T first();

    T currentItem();
}
