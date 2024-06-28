import java.util.*;

public class Auction implements AuctionMediator{
    List<Colleaque> colleaques = new ArrayList<>();
    @Override
    public void addBidder(Colleaque bidder) {
        colleaques.add(bidder);
    }

    @Override
    public void placeBid(Colleaque bidder, int bidAmount) {
        for(Colleaque colleaque:colleaques){
            if(!colleaque.getName().equals(bidder.getName())){
                colleaque.getNotified(bidAmount);
            }
        }

    }
}
