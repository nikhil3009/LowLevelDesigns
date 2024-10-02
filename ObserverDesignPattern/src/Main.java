public class Main {
    public static void main(String[] args) {
        StockObservable iphoneObj = new IphoneObserver();
        NotificationObserver obj1 = new EmailAlert("a@gmail.com",iphoneObj);
        NotificationObserver obj2 = new EmailAlert("a@gmail.com",iphoneObj);
        NotificationObserver obj3 = new EmailAlert("a@gmail.com",iphoneObj);

        iphoneObj.add(obj1);
        iphoneObj.add(obj2);
        iphoneObj.add(obj3);

        iphoneObj.setStock(11);
        iphoneObj.setStock(0);


    }
}