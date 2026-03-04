public class demoq8 {
    public static void main(String[] args) {
        

    PreferredCustomer customer = new PreferredCustomer("27", "nhung", 1200);
    System.out.println(customer);


    double purchaseAmount = 200; 
    double discountedAmount = customer.applyDiscount(purchaseAmount);
    System.out.println("Purchase amount: $" + purchaseAmount);
    System.out.println("Discounted price: $" + discountedAmount);

}
}
