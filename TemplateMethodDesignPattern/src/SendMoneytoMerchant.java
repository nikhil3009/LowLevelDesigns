public class SendMoneytoMerchant extends Payment{
    public void validate() {
        System.out.println("validated request of merchant");
    }

    @Override
    public void calculateFee() {
        System.out.println("charge 2% fee");
    }

    @Override
    public void debitMoney() {
        System.out.println("money debited from your account");

    }

    @Override
    public void creditMoney() {
        System.out.println("money credited after deducting charges to merchant account");

    }
}
