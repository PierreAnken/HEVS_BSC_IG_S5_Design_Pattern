package ChainOfResponsibility;

public class HolidayRequest {

    private String soldierName;
    private int daysOffWanted;

    public HolidayRequest(String soldierName, int daysOffWanted){
        this.daysOffWanted = daysOffWanted;
        this.soldierName = soldierName;
    }

    public String getSoldierName() {
        return soldierName;
    }

    public int getDaysOffWanted() {
        return daysOffWanted;
    }
}
