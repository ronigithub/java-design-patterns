package com.roni.designpattern.creational.factorymethod;

import com.roni.designpattern.creational.factorymethod.message.JSONMessage;
import com.roni.designpattern.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
