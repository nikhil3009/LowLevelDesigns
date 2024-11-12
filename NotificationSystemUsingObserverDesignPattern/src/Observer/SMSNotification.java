package Observer;

import Observable.Stock;

public class SMSNotification implements Notify{
    Stock stockObj;
    double number;
    public SMSNotification(Stock obj, double number){
        this.stockObj = obj;
        this.number = number;
    }
    public void update(){
        System.out.println("SMS Notification sent");
    }
}
