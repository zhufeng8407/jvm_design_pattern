package com.shengsi.design.pattern.behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();

        aggregate.add("123");
        aggregate.add("456");
        aggregate.add("hello world");
        aggregate.add("chj");
        aggregate.add("wyk");

        MyIterator<String> it = aggregate.createIterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
