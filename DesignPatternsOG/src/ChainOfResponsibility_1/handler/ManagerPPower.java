package ChainOfResponsibility_1.handler;

import ChainOfResponsibility_1.request.PurchasePower;
import ChainOfResponsibility_1.request.PurchaseRequest;

public class ManagerPPower extends PurchasePower {
    private final double ALLOWABLE = 10 * base;

    public void processRequest(PurchaseRequest request ) {
        if( request.getAmount() < ALLOWABLE )
            System.out.println("Manager will approve $"+ request.getAmount());
        else
           if( mySuccessor != null)
        	   mySuccessor.processRequest(request);
  }
}