import java.util.ArrayList;

public class ElevatorCreator {
    Static List<ElevatorController> elevatorControllerList = new ArrayList<>();
Static {
    Elevator car1 = new Elevator;
    car1.id = 1;
    Elevator car2 = new Elevator;
    car2.id = 2;

    ElevatorController controller1 = new ElevatorController(car1);
    ElevatorController controller2 = new ElevatorController(car2);


    elevatorControllerList.add(controller1);
    elevatorControllerList.add(controller2);
}

}
