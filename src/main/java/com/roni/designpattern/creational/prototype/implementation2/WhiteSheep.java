package com.roni.designpattern.creational.prototype.implementation2;

public class WhiteSheep implements Sheep{
    private String name;

    public WhiteSheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new WhiteSheep(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
