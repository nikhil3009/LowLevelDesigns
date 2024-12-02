public class Bidder implements Colleaque{
    String name;
    AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator){
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
        mediator.placeBid(this,amount);

    }

    @Override
    public void getNotified(int bidAmount) {
        System.out.println("Bid of amount "+bidAmount+" has been placed");
    }

    @Override
    public String getName() {
        return name;
    }
}
