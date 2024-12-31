import Command.TurnOnCommand;
import Invoker.RemoteControll;
import Receiver.AirConditioner;

public class Main {
    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner();
        RemoteControll myremote = new RemoteControll();
        myremote.setCommand(new TurnOnCommand(ac));
        myremote.pressButton();

        myremote.undo();
    }
}