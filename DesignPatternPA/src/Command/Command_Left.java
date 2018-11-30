package Command;

public class Command_Left implements Interface_Command{

    private Receiver_Car car;

    public Command_Left(Receiver_Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.left();
    }

    @Override
    public void undo() {
        car.right();
    }
}