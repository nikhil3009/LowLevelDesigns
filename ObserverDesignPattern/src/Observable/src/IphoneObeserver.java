public class IphoneObeserver implements StockObservable {
    List<NotificationObserver> li = new ArrayList();
    public int stockCount = 0;

    @Override
    public void add(NotificationObserver observer) {
        li.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        li.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for(NotificationObserver ob: li){
            ob.update();
        }

    }

    @Override
    public void setStock(int newStock) {
        if(stockCount == 0){
            notifyObserver();
        }
        stockCount = stockCount+newStock;
    }

    @Override
    public void getStockCount() {
        return stockCount;
    }
}
