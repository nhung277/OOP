public class demoq7 {
    public static void main(String[] args) {
        Customer customer= new Customer("nhung", "123 bd", "123-456-789", 27, true);
        

        System.out.println("Name:"+customer.getName()+"\naddress:"+customer.getAddress()+"\ntelephoneNumber"+customer.getTelephoneNumber()+"\nnumberCustomer"+customer.getNumberCustomer()+"\nthe customer wishes to be on a mailing list?"+customer.isMailingList());
    }
}
