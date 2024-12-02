public class EmailAlert implements  NotificationObserver{
    String emailId;
    StockObservable obj;
    public EmailAlert(String emailId, StockObservable obj){
        this.emailId = emailId;
        this.obj = obj;
    }
    @Override
    public void update() {
        sendEmail(emailId,"Product is back to stock");

    }
    public voud sendEmail(String emailId, String mssg){
        System.out.println("main sent");
    }
}
