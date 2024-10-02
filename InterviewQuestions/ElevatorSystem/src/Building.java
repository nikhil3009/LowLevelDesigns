import java.util.*;

public class Building {
    List<Floor> floorList = new ArrayList<>();

    public Building(List<Floor> floors){
        this.floorList = floors;
    }
    public void addFloors(Floor newFloor){
        floorList.add(newFloor);
    }
    public void removeFloor(Floor floor){
        floorList.remove(floor);
    }
    public List<Floor> getFloors(){
        return floorList;
    }
}
