public class SendMoneyToFriend extends Payment{
    @Override
    public void validate() {
        System.out.println("validated request of friend");
    }

    @Override
    public void calculateFee() {
        System.out.println("charge 0% fee");
    }

    @Override
    public void debitMoney() {
        System.out.println("money debited from your acount");

    }

    @Override
    public void creditMoney() {
        System.out.println("money credited to friend acount");

    }
}
