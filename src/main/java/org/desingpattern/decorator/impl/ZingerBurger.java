package org.desingpattern.decorator.impl;

import org.desingpattern.decorator.Burger;

public class ZingerBurger extends Burger {
    @Override
    public String getDescription() {
        return "Zinger Burger";
    }

    @Override
    public double getCost() {
        return 180.0;
    }
}
