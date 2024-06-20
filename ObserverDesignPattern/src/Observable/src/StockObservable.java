public interface StockObservable {
    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void notifyObserver();
    public void setStock(int newStock);
    public void getStockCount();

}
