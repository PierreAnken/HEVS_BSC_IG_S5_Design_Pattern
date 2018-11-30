package Command;

public class Command_Backward  implements Interface_Command{

    private Receiver_Car car;

    public Command_Backward(Receiver_Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.backward();
    }

    @Override
    public void undo() {
        car.forward();
    }
}