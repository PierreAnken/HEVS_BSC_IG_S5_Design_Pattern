package ChainOfResponsibility_1.handler;

import ChainOfResponsibility_1.request.PurchasePower;
import ChainOfResponsibility_1.request.PurchaseRequest;

public class VicePresidentPPower extends PurchasePower {
    private final double ALLOWABLE = 40 * base;

    public void processRequest(PurchaseRequest request) {
        if( request.getAmount() < ALLOWABLE )
            System.out.println("Vice President will approve $" + request.getAmount());
        else
        if( mySuccessor != null )
        	mySuccessor.processRequest(request);
  }
}