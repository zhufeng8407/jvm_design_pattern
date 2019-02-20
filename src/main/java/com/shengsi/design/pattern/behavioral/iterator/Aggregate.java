package com.shengsi.design.pattern.behavioral.iterator;

public interface Aggregate<T> {

    MyIterator<T> createIterator();

    void add(T t);
}
