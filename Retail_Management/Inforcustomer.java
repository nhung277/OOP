public class custumerq8 {
        private String customerID;
        private String name;
        private double totalPurchases;
    
    
        public custumerq8(String customerID, String name, double totalPurchases) {
            this.customerID = customerID;
            this.name = name;
            this.totalPurchases = totalPurchases;
        }
    
        
        public String getCustomerID() {
            return customerID;
        }
    
        public void setCustomerID(String customerID) {
            this.customerID = customerID;
        }
    
        
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
       
        public double getTotalPurchases() {
            return totalPurchases;
        }
    
        public void setTotalPurchases(double totalPurchases) {
            this.totalPurchases = totalPurchases;
        }
    
        
        public void addPurchase(double purchaseAmount) {
            this.totalPurchases += purchaseAmount;
        }
    }
