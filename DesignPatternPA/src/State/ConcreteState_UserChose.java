package State;

public class ConcreteState_UserChose implements InterfaceState {

    Context_CafeMachine cafeMachine;

    public ConcreteState_UserChose(Context_CafeMachine cafeMachine){
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
    public InterfaceState buttonPushed( boolean error) {

        if(error){

            System.out.println("Error: 98974, un technicien arrivera peut-être bientôt");
            return cafeMachine.getServiceNeeded();
        }else{
            System.out.println("Café préparé");
            return cafeMachine.getMakeCaffee();
        }
    }

    @Override
    public InterfaceState coinReturn() {
        System.out.println(" Retour de la monnaie :"+cafeMachine.getAmountEntered()+" CHF");
        cafeMachine.setAmout(0);
        return cafeMachine.getIdle();
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
