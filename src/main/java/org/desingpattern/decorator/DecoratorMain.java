package org.desingpattern.decorator;

import org.desingpattern.decorator.impl.ExtraCheesBurger;
import org.desingpattern.decorator.impl.ExtraMayoBurger;
import org.desingpattern.decorator.impl.ZingerBurger;

public class DecoratorMain {
    public static void main(String[] args) {
        Burger burger=new ZingerBurger();
        System.out.println(burger.getDescription()+" , "+burger.getCost());
       /* burger=new ExtraCheesBurger(burger);

        System.out.println(burger.getDescription()+" , "+burger.getCost());*/

        burger=new ExtraMayoBurger(burger);
        System.out.println(burger.getDescription()+" , "+burger.getCost());

    }
}
