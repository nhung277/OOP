package lab3;
import java.util.Scanner;

public class demoq2 {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in); 

        RetailItem item = new RetailItem("jacket", 12, 59.95);
        //RetailItem item2 = new RetailItem("DesignerJeans", 40 , 34.95);
        //RetailItem item3 =new RetailItem("Shirt ", 20, 24.95);

        System.out.println("user input quantity: ");
        int quantity= sc.nextInt();

        if (quantity< item.getUnitsOnHand()) {
            CashRegister cashRegister = new CashRegister(item, quantity);

            System.out.println(cashRegister);
          item.setUnitsOnHand(item.getUnitsOnHand()- quantity);

        }
        else {
            System.out.println("We don't enough items in Units On Hand");
        }
    }
    }
