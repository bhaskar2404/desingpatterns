package org.desingpattern.abstractfactory.impl;

import org.desingpattern.abstractfactory.Cpu;

public class MsiCpu implements Cpu {
    @Override
    public void assemble() {
        System.out.println("Assemble Msi Cpu ......");
    }
}
