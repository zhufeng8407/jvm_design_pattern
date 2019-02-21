package com.shengsi.design.pattern.behavioral.interpreter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Context {

    private Map<Varriable, Boolean> hashMap = new ConcurrentHashMap<>();


    public void assign(Varriable var, Boolean bool) {
        hashMap.put(var, bool);
    }

    public Boolean lookup(Varriable var) {
        return hashMap.get(var);
    }
}
