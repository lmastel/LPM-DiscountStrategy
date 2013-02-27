package lpm.discountstrategy;

public class Customer {

    private String customerId;
    private String customerName;

    Customer() {
    }
    
    public Customer(String customerId) {
        this.customerId = customerId;

//        dbLookupCustomer(customerId);
    }
    
    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;

        //dbLookupCustomer(custId);
    }

    

//    public void dbLookupCustomer(String customerId) {
//        System.out.println("[Customer]call FakeDB");
//        FakeDatabase db = new FakeDatabase();
//        Customer customer = db.findCustomer(customerId);
//
//        if (customer != null) {
//            System.out.println("[Customer] dbLookupCustomer != null");
//
//        }
//    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    

    public String getCustomerName() {
        return customerName;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("100");

        System.out.println("customerId = " + customer.getCustomerId());
        System.out.println("customerName = " + customer.getCustomerName());

    }
}
