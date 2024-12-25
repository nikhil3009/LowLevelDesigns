package States;

public interface MachineState {
    public void clickOnInsertCoins(VendingMachine machine) throws Exception;
    public void clickonSelectProduct(VendingMachine machine) throws Exception;
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    public void selectProduct(VendingMachine machine,int code) throws Exception;
    public int getChange(int returnExtraMoney) throws Exception;
    public void despenseProduct(VendingMachine machine,int code) throws Exception;
    public List<Coin> refundMoney(VendingMachine machine) throws Exception;

}
