package Invoker;

import Command.Icommand;

import java.util.LinkedList;
import java.util.Stack;

public class RemoteControll {
    Icommand icommand;
    Stack<Icommand> commandHistory = new Stack<>();

    public RemoteControll(){

    }

    public void setCommand(Icommand command){
        this.icommand = command;
    }

    public void pressButton(){
        icommand.execute();
        commandHistory.add(icommand);
    }
    public void undo(){
        if(!commandHistory.isEmpty()){
            Icommand lastcommand = commandHistory.pop();
            lastcommand.undo();
        }
    }

}
