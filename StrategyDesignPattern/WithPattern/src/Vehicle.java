public class Vehicle {
    DriveStrategy driveObj;

    //constructor injection
    public Vehicle(DriveStrategy drive){
        this.driveObj = drive;
    }
    public void drive(){
        driveObj.drive();
    }
}
