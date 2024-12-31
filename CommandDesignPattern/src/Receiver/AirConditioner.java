package Receiver;

public class AirConditioner {
    boolean isOn;
    int temp;

    public void turnOn(){
        isOn = true;
        System.out.println("AC has turned on");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("AC has turned off");
    }

    public void setTemp(int temp){
        this.temp = temp;
        System.out.println("AC's current temperature is : "+ temp);
    }
}
