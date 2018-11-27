package Proxy;

public class Client_Main {

    public static void main(String[] args) {

        // L'utilisation d'une classe est gérée par une autre
        //
        // Sujet : Une interface définit les méthodes
        // Sujet concret:  implémente l'interface sans vérification
        // Proxy : traite les demandes du sujet client et les transmet au besoin au sujet concret
        // Client : Utilise le proxy

        ConcretSubject_Account account = new ConcretSubject_Account(2000);

        Proxy_CarteCredit cc = new Proxy_CarteCredit(account);
        Proxy_Paypal paypal = new Proxy_Paypal(account);

        cc.debitAccount(1500);
        paypal.debitAccount(800);

    }
}
