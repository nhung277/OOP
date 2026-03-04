package lab3;
import java.util.Scanner;

public class demoq5 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        ParkedCar car = new ParkedCar("Toyota", "Camry", "Red", "XYZ123", 121); 

        // create hàm đã mua minutes from ParkingMeter
        ParkingMeter parkingMeter = new ParkingMeter(60);

        // Create a police man
        PoliceOfficer policeOfficer = new PoliceOfficer("Tuan", "hehe111" );

        // Check xe and đã mua minutes if vượt thì phạt
        ParkingTicket parkingTicket = policeOfficer.checkCar(car, parkingMeter);

        // Out the information
        if ( parkingTicket != null ) {
            System.out.println( "Car :" + "\n" + parkingTicket.getPackedCarInfor() );

            // Fine nhiu 
            System.out.println("Fine : " + parkingTicket.getFine() );
            
            // Xử lí bởi ai 
            System.out.println("Resolve by: " + parkingTicket.getName()  +" with " + parkingTicket.getBadge() );

        } else {
            System.out.println("No ticket, yeah");}
        }
    }
        

    