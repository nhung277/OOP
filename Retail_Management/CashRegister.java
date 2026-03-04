package lab3;
public class CashRegister {

    private double Tax=0.06;
    private RetailItem Item ;
    private int Quanity;

    public CashRegister(RetailItem item, int quanity) {
        this.Item = item;
        this.Quanity = quanity;}

    public double getSubTotal() {
        return Item.getPrice()*Quanity;
    }
    public double getTax() {
        return getSubTotal()*Tax;
    }
    public double getTotal() {
        return getSubTotal()+getTax();
    }
    @Override
    public String toString() {
        return "Subtotal: " + getSubTotal()
        + "\nTax: " + getTax()
        + "\nTotalCost: " + getTotal();
    }



}
