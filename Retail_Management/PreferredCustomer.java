
   public class PreferredCustomer extends custumerq8 {
        private double discountLevel;
    

        public PreferredCustomer(String customerID, String name, double totalPurchases) {
            super(customerID, name, totalPurchases);
            setDiscountLevel(totalPurchases); 
        }
    l
        public double getDiscountLevel() {
            return discountLevel;
        }
    

        public void setDiscountLevel(double totalPurchases) {
            if (totalPurchases >= 2000) {
                this.discountLevel = 10; // 10% discount
            } else if (totalPurchases >= 1500) {
                this.discountLevel = 7; // 7% discount
            } else if (totalPurchases >= 1000) {
                this.discountLevel = 6; // 6% discount
            } else if (totalPurchases >= 500) {
                this.discountLevel = 5; // 5% discount
            } else {
                this.discountLevel = 0; // No discount
            }
        }
    

        public double applyDiscount(double purchaseAmount) {
            double discount = (purchaseAmount * discountLevel) / 100;
            return purchaseAmount - discount;
        }
    

        @Override
        public String toString() {
            return "Customer ID: " + getCustomerID() + "\n" +
                   "Name: " + getName() + "\n" +
                   "Total Purchases: $" + getTotalPurchases() + "\n" +
                   "Discount Level: " + discountLevel + "%";
        }
    }
