package com.roni.designpattern.creational.factorymethod;

import com.roni.designpattern.creational.factorymethod.message.Message;
import com.roni.designpattern.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
