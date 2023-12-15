package org.desingpattern.factory.impl;

import org.desingpattern.factory.Burger;

public class ChickernBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Chicken Buger");
    }
}
