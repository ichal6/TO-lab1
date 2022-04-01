package com.lechowicz;

public class File extends Node{
    protected byte[] content;

    public File(String name, INode parent, byte[] content) {
        this.content = content;
        this.parent = parent;
        this.name = name;
    }

    public byte[] getContent() {
        return this.content;
    }

    public void setContent(byte[] con) {
        this.content = con;
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
