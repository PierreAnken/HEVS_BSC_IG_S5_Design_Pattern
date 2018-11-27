package ChainOfResponsibility;

public class ConcretHandler_Sergeant extends AbstractHandler_RankedSoldier {

    public ConcretHandler_Sergeant(String name, AbstractHandler_RankedSoldier  successor){
        maxDaysCanAllow = 2;
        this.name = "sergeant "+name;
        this.successor = successor;
    }



    @Override
    void ProcessHolidayRequest(HolidayRequest request) {
        if(request.getDaysOffWanted() <= maxDaysCanAllow){
            System.out.println(name+" approved the request from "+request.getSoldierName()+" for "+request.getDaysOffWanted()+" days holidays.");
        }
        else{
            successor.ProcessHolidayRequest(request);
        }
    }
}
