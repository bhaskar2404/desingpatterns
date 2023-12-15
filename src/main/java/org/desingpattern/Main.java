package org.desingpattern;

import org.desingpattern.factory.Restaurant;
import org.desingpattern.factory.impl.NonVegBurgerRestaurant;
import org.desingpattern.factory.impl.VeggieBurgerRestaurant;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Restaurant chickenBurger=new NonVegBurgerRestaurant();
        chickenBurger.orderBurger();

        Restaurant vegBurger=new VeggieBurgerRestaurant();
        vegBurger.orderBurger();

    }
}