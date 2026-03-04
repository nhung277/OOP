package lab3;
public class PoliceOfficer {

    private String namePolice;
    private String badgeNumber;

    public PoliceOfficer(String namePolice, String badgeNumber) {
        this.namePolice = namePolice;
        this.badgeNumber = badgeNumber;}
        
    public String getNamePolice() {
        return namePolice;
    }
    public void setNamePolice(String namePolice) {
        this.namePolice = namePolice;
    }
    public String getBadgeNumber() {
        return badgeNumber;
    }
    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
   
    public ParkingTicket checkCar ( ParkedCar parkedCar , ParkingMeter parkingMeter ) {
        if ( parkedCar.getNumberOfMinutes() > parkingMeter.getPurchasedNumber() ) {
            // infor xe , tên và số hiệu ng phạt ở policeOfficer
            return new ParkingTicket(parkedCar, namePolice, badgeNumber);
        }
        return null;
    }
}

