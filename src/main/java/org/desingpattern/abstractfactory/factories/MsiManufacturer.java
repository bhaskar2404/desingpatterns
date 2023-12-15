package org.desingpattern.abstractfactory.factories;

import org.desingpattern.abstractfactory.Cpu;
import org.desingpattern.abstractfactory.Monitor;
import org.desingpattern.abstractfactory.impl.MsiCpu;
import org.desingpattern.abstractfactory.impl.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public Cpu createGpu() {
        return new MsiCpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
