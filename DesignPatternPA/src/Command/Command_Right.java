package Command;

public class Command_Right implements Interface_Command{

    private Receiver_Car car;

    public Command_Right(Receiver_Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.right();
    }

    @Override
    public void undo() {
        car.left();
    }
}
