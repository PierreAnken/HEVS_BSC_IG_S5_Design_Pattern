package Command;

public class Command_Forward  implements Interface_Command{

    private Receiver_Car car;

    public Command_Forward(Receiver_Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.forward();
    }

    @Override
    public void undo() {
        car.backward();
    }
}