package Proxy;

public class ConcretSubject_Account implements Subject_AccountManager {


    private double accountBalance;

    public ConcretSubject_Account(double acountBalance){
        this.accountBalance = acountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }


    @Override
    public void debitAccount(int amount) {
         accountBalance -= amount;
    }
}
