package org.desingpattern.factory.impl;

import org.desingpattern.factory.Burger;

public class CheeseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Cheese Burger");
    }
}
