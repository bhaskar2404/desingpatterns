package org.desingpattern.factory;

public  abstract class Restaurant {
    public  void  orderBurger(){
        System.out.println("Ordering Burger in progress...");
        Burger burger=createBurger();
    }

    protected abstract Burger createBurger();

}
