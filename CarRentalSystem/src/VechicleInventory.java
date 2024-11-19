import Product.Vehicle;

import java.util.List;

public class VechicleInventory {
    List<Vehicle> vehicles;

    public VechicleInventory(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
