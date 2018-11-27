package State;

public class ConcreteState_Idle implements InterfaceState {

    Context_CafeMachine cafeMachine;

    public ConcreteState_Idle(Context_CafeMachine cafeMachine){
        this.cafeMachine = cafeMachine;
    }


    @Override
    public InterfaceState resetButton() {
        System.out.println("Je vais déjà bien merci...");
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
        if(cafeMachine.getAmountEntered()+amount >= cafeMachine.CAFEPRICE){
            System.out.println("Veuillez choisir votre café");
            return cafeMachine.getUserChose();
        }
        else{
            cafeMachine.setAmout(cafeMachine.getAmountEntered()+amount);
            System.out.println("Il manque "+(cafeMachine.CAFEPRICE-cafeMachine.getAmountEntered())+" CHF");
            return cafeMachine.getInsertingCoin();
        }
    }

    @Override
    public InterfaceState powerUp() {
        System.out.println("...");
        return this;
    }
}
