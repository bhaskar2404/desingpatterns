package org.desingpattern.abstractfactory.impl;

import org.desingpattern.abstractfactory.Cpu;
import org.desingpattern.abstractfactory.Monitor;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Msi Monitor .....");
    }
}
