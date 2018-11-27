package State;

public class ConcreteState_Off implements InterfaceState {

    Context_CafeMachine cafeMachine;

    public ConcreteState_Off(Context_CafeMachine cafeMachine){
        this.cafeMachine = cafeMachine;
    }

    @Override
    public InterfaceState resetButton() {
        System.out.println("...");
        return this;
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
        System.out.println("... l'argent retombe");
        return this;
    }

    @Override
    public InterfaceState powerUp() {
        System.out.println(" Bzzzz, machine à cafés démarrée");
        System.out.println(" Par ici l'argent pour un nouveau café");
        return cafeMachine.getIdle();
    }
}
