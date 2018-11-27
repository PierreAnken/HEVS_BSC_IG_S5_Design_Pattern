package State;

public class Context_CafeMachine {

    protected final double CAFEPRICE = 3.5;
    private double amountEntered = 0;

    private InterfaceState off = new ConcreteState_Off(this);
    private InterfaceState idle = new ConcreteState_Idle(this);
    private InterfaceState userChose = new ConcreteState_UserChose(this);
    private InterfaceState makeCaffee = new ConcreteState_MakeCaffee(this);
    private InterfaceState serviceNeeded = new ConcreteState_ServiceNeeded(this);
    private InterfaceState insertingCoin = new ConcreteState_InsertingCoin(this);

    private InterfaceState state = off;

    // liste des etats possible

    public void resetButton(){
        System.out.println(" => reset pressed ");
        state = state.resetButton();
    }
    public void cupRemoved(){
        System.out.println(" => cup removed ");
        state = state.cupRemoved();
    }
    public void buttonPushed(boolean error){
        System.out.println(" => cafe selected");
        state = state.buttonPushed(error);
    }

    public void coinInserted(double amount){
        System.out.println(" => inserted "+amount+" CHF");
        state = state.coinInserted(amount);
    }
    public void powerUp(){
        System.out.println(" => machine powered up");
        state = state.powerUp();
    }

    public double getAmountEntered() {
        return amountEntered;
    }

    public void setAmout(double amount) {
        this.amountEntered = amount;
    }


    public InterfaceState getIdle() {
        return idle;
    }

    public InterfaceState getUserChose() {
        return userChose;
    }

    public InterfaceState getMakeCaffee() {
        return makeCaffee;
    }

    public InterfaceState getServiceNeeded() {
        return serviceNeeded;
    }

    public InterfaceState getInsertingCoin() {
        return insertingCoin;
    }
}
