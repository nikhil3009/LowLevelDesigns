package States.impl;
import VendingMachine;
import States.MachineState;

public class HasMoreMoney implements MachineState {
    @Override
    public void clickOnInsertCoins(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickonSelectProduct(VendingMachine machine) throws Exception {
        machine.setMachineState(new SelectProductState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("coins accepted");

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
