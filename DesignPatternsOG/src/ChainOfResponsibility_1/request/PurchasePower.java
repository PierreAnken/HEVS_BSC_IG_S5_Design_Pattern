package ChainOfResponsibility_1.request;

public abstract class PurchasePower {

    protected final double base = 500;

    public void setSuccessor(PurchasePower successor){
        this.mySuccessor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);

	protected PurchasePower mySuccessor;
}