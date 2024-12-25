package States.impl;
import VendingMachine;
import States.MachineState;
import Coin;

import java.util.List;

public class IdleState implements MachineState {

    @Override
    public void clickOnInsertCoins(VendingMachine machine) throws Exception {
        machine.setMachineState(new HasMoreMoney());

    }

    @Override
    public void clickonSelectProduct(VendingMachine machine) throws Exception {
        throw new Exception("invalid");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("invalid");

    }

    @Override
    public void selectProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("invalid");
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        return 0;
    }

    @Override
    public void despenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("invalid");

    }

    @Override
    public List<Coin> refundMoney(VendingMachine machine) throws Exception {
        throw new Exception("invalid");
    }
}
