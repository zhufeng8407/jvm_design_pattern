package com.shengsi.design.pattern.behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> elementList = new ArrayList<>();

    public void attach(Element element) {
        elementList.add(element);
    }

    public void remove(Element element) {
        elementList.remove(element);
    }

    public void accept(Visitor visitor) {
        for(Element e : elementList) {
            e.accept(visitor);
        }
    }
}
