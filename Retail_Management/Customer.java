public class Customer extends Person {
    private int numberCustomer;
    private boolean mailingList;
    public Customer(String name, String address, String telephoneNumber, int numberCustomer, boolean mailingList) {
        super(name, address, telephoneNumber);
        this.numberCustomer = numberCustomer;
        this.mailingList = mailingList;
    }
    public int getNumberCustomer() {
        return numberCustomer;
    }
    public void setNumberCustomer(int numberCustomer) {
        this.numberCustomer = numberCustomer;
    }
    public boolean isMailingList() {
        return mailingList;
    }
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    
}
