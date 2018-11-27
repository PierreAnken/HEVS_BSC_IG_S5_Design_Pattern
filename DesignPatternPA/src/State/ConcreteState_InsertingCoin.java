package State;

public class ConcreteState_InsertingCoin implements InterfaceState {

    Context_CafeMachine cafeMachine;

    public ConcreteState_InsertingCoin(Context_CafeMachine cafeMachine){
        this.cafeMachine = cafeMachine;
    }

    @Override
    public InterfaceState resetButton() {
        System.out.println("Le retour d'argent c'est l'autre bouton");
        return this;
    }

    @Override
    public InterfaceState cupRemoved() {
        System.out.println("...");
        return this;
    }

    @Override
    public InterfaceState buttonPushed(boolean error) {
        System.out.println("Il manque "+(cafeMachine.CAFEPRICE-cafeMachine.getAmountEntered())+" CHF");
        return this;
    }

    @Override
    public InterfaceState coinReturn() {
        System.out.println("...");
        return this;
    }

    @Override
    public InterfaceState coinInserted(double amount) {
        if(cafeMachine.getAmountEntered()+amount >= cafeMachine.CAFEPRICE){
            System.out.println("Veuillez choisir votre café");
            return cafeMachine.getUserChose();
        }
        else{
            cafeMachine.setAmout(cafeMachine.getAmountEntered()+amount);
            System.out.println("Il manque "+(cafeMachine.CAFEPRICE-cafeMachine.getAmountEntered())+" CHF");
            return this;
        }
    }

    @Override
    public InterfaceState powerUp() {
        return null;
    }
}
