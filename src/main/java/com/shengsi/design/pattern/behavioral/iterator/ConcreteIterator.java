package com.shengsi.design.pattern.behavioral.iterator;


public class ConcreteIterator<T> implements MyIterator<T> {

    private ConcreteAggregate<T> concreteAggregate;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public T next() {
        return concreteAggregate.next();
    }

    @Override
    public boolean hasNext() {
        return concreteAggregate.hasNext();
    }

    @Override
    public T first() {

        return concreteAggregate.first();
    }

    @Override
    public T currentItem() {
        return concreteAggregate.currentItem();
    }
}
