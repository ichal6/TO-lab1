package com.lechowicz;

public interface INode {
    public String getName();
    public void setName(String name);
    public INode getParent();
    public void setParent(INode parent);
}
