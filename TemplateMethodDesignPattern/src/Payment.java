public abstract class Payment {
    public abstract void validate();
    public abstract void calculateFee();
    public abstract void debitMoney();
    public abstract void creditMoney();

    public final void  sendMoney(){
        validate();
        calculateFee();
        debitMoney();
        creditMoney();
    }

}
