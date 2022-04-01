package com.lechowicz;

import java.util.LinkedList;
import java.util.List;

public class Catalog extends Node{
    protected List<INode> list;

    public Catalog(String name, INode parent) {
        this.list = new LinkedList<>();
        this.parent = parent;
        this.name = name;
    }

    public INode getElement(INode el){
        int index = this.list.indexOf(el);
        if(index != -1){
            return this.list.get(index);
        } else {
            return null;
        }
    }

    public List<INode> getAllElements(){
        return this.list;
    }

    public void setElement(INode oldEl, INode newEl){
        for (INode exElem: this.list) {
            if(exElem.getName().equals(newEl.getName()))
                return;
        }

        int index = this.list.indexOf(oldEl);
        if (index != -1) {
            this.list.set(index, newEl);
        }
    }

    public void remElement(INode el){
        this.list.remove(el);
    }

    public void addElement(INode el){
        for (INode exElem: this.list) {
            if(exElem.getName().equals(el.getName()))
                return;
        }
        this.list.add(el);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public INode getParent() {
        return this.parent;
    }

    @Override
    public void setParent(INode parent) {
        this.parent = parent;
    }
}
