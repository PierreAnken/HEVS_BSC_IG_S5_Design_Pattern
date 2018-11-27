package State;

public class ConcreteState_MakeCaffee implements InterfaceState {

    Context_CafeMachine cafeMachine;

    public ConcreteState_MakeCaffee(Context_CafeMachine cafeMachine){
        this.cafeMachine = cafeMachine;
    }


    @Override
    public InterfaceState resetButton() {
        System.out.println("...");
        return this;
    }

    @Override
    public InterfaceState cupRemoved() {

        double reste = cafeMachine.getAmountEntered() - cafeMachine.CAFEPRICE;
        if(reste > 0){
            System.out.println("retour de la monnaie, "+reste+" CHF");
            cafeMachine.setAmout(0);
        }

        System.out.println("merci et à bientôt!");
        System.out.println("Par ici l'argent pour un nouveau café");
        return cafeMachine.getIdle();
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
        System.out.println("...");
        return this;
    }
}
