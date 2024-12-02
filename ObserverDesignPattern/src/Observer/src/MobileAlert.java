public class MobileAlert  implements  NotificationObserver{
String userName;
StockObservable obj;
public MobileAlert(String emailId, StockObservable obj){
    this.userName = emailId;
    this.obj = obj;
}
    @Override
    public void update() {
        sendAlert(userName,"Product is back to stock");

    }
    public void sendAlert(String userName, String mssg){
        System.out.println("mssg sent");
    }
}
