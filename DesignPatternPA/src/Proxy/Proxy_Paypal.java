package Proxy;

public class Proxy_Paypal implements Subject_AccountManager{

    private ConcretSubject_Account account;

    public Proxy_Paypal(ConcretSubject_Account account){
        this.account = account;
    }

    @Override
    public void debitAccount(int amount) {
        if(account.getAccountBalance() >= amount){
            account.debitAccount(amount);
            System.out.println("Paypal: transaction effectuée: nouveau solde:"+ account.getAccountBalance());

        }
        else{
            System.out.printf("Paypal: échec de paiement, solde insuffisant");
        }
    }
}
