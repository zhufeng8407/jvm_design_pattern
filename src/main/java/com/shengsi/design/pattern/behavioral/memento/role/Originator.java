package com.shengsi.design.pattern.behavioral.memento.role;

import com.shengsi.design.pattern.behavioral.memento.Trandata;

public class Originator {

    private Trandata trandata;

    public Memento createMemento() {
        return new Memento(trandata);
    }

    /**
     * 恢复
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        copyProperties(memento.getTrandata(), trandata);
    }

    private void copyProperties(Trandata trandataFrom, Trandata trandataTo) {
    }
}
