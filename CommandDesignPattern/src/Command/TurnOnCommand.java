package Command;

import Receiver.AirConditioner;

public class TurnOnCommand implements Icommand{
    AirConditioner ac;
    public TurnOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
