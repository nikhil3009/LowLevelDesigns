package States;

public interface VendingStates {
    public void selectInsertCashButton(;VendingMachine obj);
    public void insertCastButton(VendingMachine obj);
    public void selectSelectProductButton(VendingMachine obj);
    public void selectProduct(VendingMachine obj);
    public Item dispenseProduct(VendingMachine obj, int codeNumber);
    public int dispenseExtraBalance(int returnChange);
    public List<Coin> refundMoney(VendingMachine obj);

}
