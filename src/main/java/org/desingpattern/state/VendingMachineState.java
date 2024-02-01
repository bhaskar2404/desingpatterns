package org.desingpattern.state;

public interface VendingMachineState {
    void insertCoin();
    void ejectCoin();
    void selectProduct();
    void dispenseProduct();
}
