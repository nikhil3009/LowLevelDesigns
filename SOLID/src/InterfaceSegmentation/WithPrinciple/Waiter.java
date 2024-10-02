package InterfaceSegmentation.WithPrinciple;

import InterfaceSegmentation.WaiterInterface;
// this class is not implementing any method which is not required
public class Waiter implements WaiterInterface {
    public void serveFood(){
        System.out.println("served food");
    }
    public void cleanTable(){
        System.out.println("cleared table");
    }
}
