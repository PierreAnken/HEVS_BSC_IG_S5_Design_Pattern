package Command;

public class Invoker_Game {

    Interface_Command[] commands = new Interface_Command[4];
    private Interface_Command lastCommand;

    public void pushKey(int key) {
        commands[key].execute();
        lastCommand = commands[key];
    }

    public void setCommand(int key, Interface_Command command){
        commands[key] = command;
    }

    public void undo(){
        System.out.println("Undo");
        lastCommand.undo();
    }

}
