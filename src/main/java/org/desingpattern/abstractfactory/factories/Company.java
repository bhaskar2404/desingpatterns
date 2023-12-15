package org.desingpattern.abstractfactory.factories;

import org.desingpattern.abstractfactory.Cpu;
import org.desingpattern.abstractfactory.Monitor;

public abstract class Company {

    public abstract Cpu createGpu();

    public abstract Monitor createMonitor();

}