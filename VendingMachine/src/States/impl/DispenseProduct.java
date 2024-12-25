package States.impl;

import States.MachineState;

public class DispenseProduct implements MachineState {
    @Override
    public void clickOnInsertCoins(VendingMachine machine) throws Exception {

    }

    @Override
    public void clickonSelectProduct(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void selectProduct(VendingMachine machine, int code) throws Exception {

    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        return 0;
    }

    @Override
    public void despenseProduct(VendingMachine machine, int code) throws Exception {

    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) throws Exception {
        return null;
    }
}
