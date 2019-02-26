package com.shengsi.design.pattern.behavioral.memento.role;

import com.shengsi.design.pattern.behavioral.memento.Trandata;

public class Memento {

    private Trandata trandata;

    public Memento(Trandata trandata) {
        this.trandata = trandata;
    }

    public Trandata getTrandata() {
        return trandata;
    }

    public void setTrandata(Trandata trandata) {
        this.trandata = trandata;
    }
}
