package org.desingpattern.decorator.impl;

import org.desingpattern.decorator.Burger;
import org.desingpattern.decorator.BurgerDrcorator;

public class ExtraCheesBurger extends BurgerDrcorator {
    private Burger burger;
    public ExtraCheesBurger(Burger burger) {
        this.burger=burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() +"with extra cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+10;
    }
}
