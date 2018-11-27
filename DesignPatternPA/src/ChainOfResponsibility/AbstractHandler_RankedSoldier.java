package ChainOfResponsibility;

abstract class AbstractHandler_RankedSoldier {

        protected int maxDaysCanAllow;
        protected String name;
        protected AbstractHandler_RankedSoldier successor;

        abstract void ProcessHolidayRequest(HolidayRequest request);

}
