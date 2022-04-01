package com.lechowicz;

public class NodeProxy implements INode{
    protected INode element;

    public NodeProxy(INode element) {
        this.element = element;
    }

    @Override
    public String getName() {
        return this.element.getName();
    }

    @Override
    public void setName(String name) {
        this.element.setName(name);
    }

    @Override
    public INode getParent() {
        return this.element.getParent();
    }

    @Override
    public void setParent(INode parent) {
        this.element.setParent(parent);
    }
}
