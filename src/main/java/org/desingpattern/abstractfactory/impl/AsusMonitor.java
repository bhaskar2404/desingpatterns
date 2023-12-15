package org.desingpattern.abstractfactory.impl;

import org.desingpattern.abstractfactory.Cpu;

public class AsusMonitor implements Cpu {
    @Override
    public void assemble() {
        System.out.println("Asus Monitor...");
    }
}
