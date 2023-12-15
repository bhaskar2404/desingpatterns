package org.desingpattern.decorator.impl;

import org.desingpattern.decorator.INotifier;

public class BaseNotifierDecorator implements INotifier {
    @Override
    public void sendMessage(String message) {


    }

    @Override
    public String getUsername() {
        return null;
    }
}
