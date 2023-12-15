package org.desingpattern.factory.impl;

import org.desingpattern.factory.Burger;
import org.desingpattern.factory.Restaurant;

public class NonVegBurgerRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        System.out.println("creating Chicken burger...");
        return new ChickernBurger();
    }
}
