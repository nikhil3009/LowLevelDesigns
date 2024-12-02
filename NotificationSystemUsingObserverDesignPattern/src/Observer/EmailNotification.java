package Observer;

import Observable.Stock;

public class EmailNotification implements Notify{
    String email;
    Stock stockObj;

    public EmailNotification(Stock obj, String email)
    {
        this.stockObj = obj;
        this.email = email;
    }
    public void update(){
        System.out.println("Email notification sent");
    }
}
