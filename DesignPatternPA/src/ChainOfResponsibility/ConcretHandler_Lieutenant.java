package ChainOfResponsibility;

public class ConcretHandler_Lieutenant  extends AbstractHandler_RankedSoldier {

    public ConcretHandler_Lieutenant(String name, AbstractHandler_RankedSoldier  successor){
        maxDaysCanAllow = 5;
        this.name = "lieutenant "+name;
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