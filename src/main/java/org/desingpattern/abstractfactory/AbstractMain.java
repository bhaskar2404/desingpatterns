package org.desingpattern.abstractfactory;

import org.desingpattern.abstractfactory.factories.AsusManufacturer;
import org.desingpattern.abstractfactory.factories.Company;
import org.desingpattern.abstractfactory.factories.MsiManufacturer;

import java.util.List;

public class AbstractMain {
    public static void main(String[] args) {
        Company asus=new AsusManufacturer();
        Company msi=new MsiManufacturer();
        List.of(asus.createGpu(),asus.createMonitor(),msi.createGpu(),msi.createMonitor())
                .forEach(Product::assemble);
    }
}
