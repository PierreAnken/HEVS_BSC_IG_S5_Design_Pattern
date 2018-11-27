package State;

public class ConcreteState_ServiceNeeded implements InterfaceState {

    Context_CafeMachine cafeMachine;

    public ConcreteState_ServiceNeeded(Context_CafeMachine cafeMachine){
        this.cafeMachine = cafeMachine;
    }

    @Override
    public InterfaceState resetButton() {
        System.out.println("Machine réparée, merci pour votre argent, que vous ne reverez plus jamais...");
        cafeMachine.setAmout(0);
        return cafeMachine.getIdle();
    }

    @Override
    public InterfaceState cupRemoved() {
        System.out.println("...");
        return this;
    }

    @Override
    public InterfaceState buttonPushed(boolean error) {
        System.out.println("...");
        return this;
    }

    @Override
    public InterfaceState coinReturn() {
        System.out.println("...");
        return this;
    }

    @Override
    public InterfaceState coinInserted(double amount) {
        System.out.println("...");
        return this;
    }

    @Override
    public InterfaceState powerUp() {
        System.out.println("...");
        return this;
    }
}
