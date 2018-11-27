package ChainOfResponsibility;

public class ConcreteHandler_Major extends AbstractHandler_RankedSoldier {

    public  ConcreteHandler_Major(String name, AbstractHandler_RankedSoldier  successor){
        maxDaysCanAllow = 10;
        this.name = "major "+name;
        this.successor = successor;
    }


    @Override
    void ProcessHolidayRequest(HolidayRequest request) {
        if(request.getDaysOffWanted() <= maxDaysCanAllow){
            System.out.println(name+" approved the request from "+request.getSoldierName()+" for "+request.getDaysOffWanted()+" days holidays.");
        }
        else{
            System.out.println(name+" rejected the request from "+request.getSoldierName()+" for "+request.getDaysOffWanted()+" days holidays.");
        }
    }
}