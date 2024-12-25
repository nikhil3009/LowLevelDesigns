import java.util.ArrayList;

public class VendingMachine {
    MachineState machineState;
    Inventory inventory;
    List<Coins> coins;
    public VendingMachine() {
        machineState = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }

    public void setMachineState(MachineState machineState) {
        this.machineState = machineState;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setCoins(List<Coins> coins) {
        this.coins = coins;
    }

    public MachineState getMachineState() {
        return machineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Coins> getCoins() {
        return coins;
    }
}
