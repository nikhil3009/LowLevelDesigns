package Observable;

import java.util.*;
import Observer.Notify;
public class IphoneStock implements Stock {
    List<Notify> observerList = new ArrayList<>();
    int stock;
    @Override
    public void add(Notify obj) {
        observerList.add(obj);
    }

    @Override
    public void delete(Notify obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyall() {
        for(Notify o:observerList){
            o.update();
        }
    }

    @Override
    public void setStock(int newStock) {
        if(stock == 0){
            notifyall();
        }
        stock = stock+newStock;
    }

    @Override
    public int getStock() {
        return stock;
    }
}
