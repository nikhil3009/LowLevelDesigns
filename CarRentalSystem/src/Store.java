import Product.VechicleType;
import Product.Vehicle;

import java.util.List;

public class Store {
    VechicleInventory viobj;
    int storeId;
    Location loc;
    List<Reservation> obj;

    public List<Vehicle> getVehicles(VechicleType type){
        return viobj.getVehicles();
    }
    public void setVehicles(List<Vehicle> obj){
        viobj.setVehicles(obj);
    }
    //create reservation

    //complete reservation

}
