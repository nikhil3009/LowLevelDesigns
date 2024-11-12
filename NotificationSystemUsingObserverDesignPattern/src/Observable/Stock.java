package Observable;
import Observer.Notify;
public interface Stock {
    public void add(Notify obj);
    public void delete(Notify obj);
    public void notifyall();
    public void setStock(int stock);
    public int getStock();
}
