package org.desingpattern.abstractfactory.factories;

import org.desingpattern.abstractfactory.Cpu;
import org.desingpattern.abstractfactory.Monitor;
import org.desingpattern.abstractfactory.impl.AsusCpu;
import org.desingpattern.abstractfactory.impl.MsiMonitor;

public class AsusManufacturer extends Company{
    @Override
    public Cpu createGpu() {
        return new AsusCpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
