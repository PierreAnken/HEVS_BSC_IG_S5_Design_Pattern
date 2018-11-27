package ChainOfResponsibility;

public class Client_Main {
    public static void main(String[] args) {

        // Une requete est passée au 1er maillon de la chaine
        // S'il ne peut la traiter il la passe au suivant et ainsi de suite
        //
        // Client: transmet une demande à la chaine
        // AbstractHandler: 2 méthodes : traiter la demander et définir le successeur
        // ConcreteHandler: définit la manière de traiter la demande ou la passer au suivante

        HolidayRequest request1 = new HolidayRequest("Marc",2);
        HolidayRequest request2 = new HolidayRequest("Jean",5);
        HolidayRequest request3 = new HolidayRequest("Paul",12);


        AbstractHandler_RankedSoldier smith = new ConcreteHandler_Major("Smith",null);
        AbstractHandler_RankedSoldier karl = new ConcretHandler_Lieutenant("Karl", smith);
        AbstractHandler_RankedSoldier bob = new ConcretHandler_Sergeant("Bob", karl);

        bob.ProcessHolidayRequest(request1);
        bob.ProcessHolidayRequest(request2);
        bob.ProcessHolidayRequest(request3);

    }
}
