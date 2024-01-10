package com.roni.designpattern.creational.factorymethod.message;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "Text";
    }
}
