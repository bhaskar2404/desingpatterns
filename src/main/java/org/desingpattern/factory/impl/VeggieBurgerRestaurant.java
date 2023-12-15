package org.desingpattern.factory.impl;

import org.desingpattern.factory.Burger;
import org.desingpattern.factory.Restaurant;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    protected Burger createBurger() {
        System.out.println("creating Vegi Burger.....");
        return new CheeseBurger();
    }
}
