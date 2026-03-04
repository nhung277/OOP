package lab3;
public class ParkingTicket {
    private ParkedCar parkedCar;
    private double fine;
    private String name;
    private String badge;

    public ParkingTicket(ParkedCar parkedCar,  String name, String badge) {
        this.parkedCar = parkedCar;
        caculateFine(fine);
        this.name= name;
        this.badge=badge;
    }
    
    public double getFine() {
        return fine;
    }
    public void caculateFine(double fine) {
        double overTime=parkedCar.getNumberOfMinutes()-60;
        if (overTime>0) {
            fine= 25+(Math.ceil(overTime/60))*10;
        } else {
            fine=0;
        }
    }

    public String getName() {
        return name;
    }

    public String getBadge() {
        return badge;
    }
    public String getPackedCarInfor() {
        return "Make: " + parkedCar.getMake() + "\nMode: " + parkedCar.getModel() + "\nColor: " + parkedCar.getColor()  + "\nLicense number: " + parkedCar.getLicenseNumber();

    }
}
