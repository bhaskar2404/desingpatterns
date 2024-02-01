package org.desingpattern.decorator.impl;

import org.desingpattern.decorator.Burger;
import org.desingpattern.decorator.BurgerDrcorator;

public class ExtraMayoBurger extends BurgerDrcorator {

    private Burger burger;
    public ExtraMayoBurger(Burger burger){
        this.burger=burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription()+" with extra mayo";
    }

    @Override
    public double getCost() {
        return burger.getCost()+30;
    }
}
