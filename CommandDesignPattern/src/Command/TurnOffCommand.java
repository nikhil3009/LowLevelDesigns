package Command;

import Receiver.AirConditioner;

public class TurnOffCommand implements Icommand{
    AirConditioner ac;
    public TurnOffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
