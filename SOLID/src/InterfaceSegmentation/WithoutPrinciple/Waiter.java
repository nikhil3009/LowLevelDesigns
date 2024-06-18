package InterfaceSegmentation;
//here the waiter class is implementing the methods which are not needed by it
// so this is not following interface segmentation principle as
// it is implementing the methods of interface which are not required by it.
public class Waiter implements Restaturant {
    public void washDishes(){
        // not my responsibility
    }
    public void serveFood(){
        System.out.println("served food");
    }
    public void cookFood(){
        // not my responsibility
    }
}
