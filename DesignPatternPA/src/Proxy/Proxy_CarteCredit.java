package Proxy;

public class Proxy_CarteCredit implements Subject_AccountManager {

    private ConcretSubject_Account account;

    public Proxy_CarteCredit(ConcretSubject_Account account){
        this.account = account;
    }

    @Override
    public void debitAccount(int amount) {
        if(account.getAccountBalance() >= amount){
            account.debitAccount(amount);
            System.out.println("CarteCredit: transaction effectuée: nouveau solde:"+ account.getAccountBalance());

        }
        else{
            System.out.printf("CarteCredit: échec de paiement, solde insuffisant");
        }
    }
}
