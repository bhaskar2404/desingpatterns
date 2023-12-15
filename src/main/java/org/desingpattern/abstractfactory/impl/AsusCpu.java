package org.desingpattern.abstractfactory.impl;

import org.desingpattern.abstractfactory.Cpu;

public class AsusCpu implements Cpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus CPU........");
    }
}
