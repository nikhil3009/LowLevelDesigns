import Observable.IphoneStock;
import Observable.Stock;
import Observer.EmailNotification;
import Observer.Notify;
import Observer.SMSNotification;

public class Main {
    public static void main(String[] args) {

        Stock obj = new IphoneStock();
        Notify observer1 = new EmailNotification(obj,"abc@gmail.com");
        Notify observer2 = new SMSNotification(obj,1234567890);

        obj.add(observer1);
        obj.add(observer2);
        obj.setStock(10);

    }
}