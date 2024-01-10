package com.roni.designpattern.creational.factorymethod.message;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
