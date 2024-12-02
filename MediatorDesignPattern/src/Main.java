public class Main {
    public static void main(String[] args) {

        AuctionMediator auction = new Auction();
        Colleaque bider1 = new Bidder("A",auction);
        Colleaque bider2 = new Bidder("B",auction);

        bider1.placeBid(1000);
        bider2.placeBid(2000);
        bider1.placeBid(5000);

    }
}