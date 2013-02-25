package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Customer {

    private String custId;
    private String custName;
    //private Customer[] customers = {};

    public Customer(String custId, String custName) {
        this.custId = custId;
        this.custName = custName;
        
        //dbLookupCustomer(custId);
    }

    public void dbLookupCustomer(String custId) {
        //System.out.println("[Customer]exec FakeDB"); 
        FakeDatabase db =  new FakeDatabase();
        Customer customer = db.findCustomer(custId);
        
        
        if(customer != null) {
            System.out.println("[Customer] dbLookupCustomer != null");
                     
        }
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("100", "John Smith");
        
        System.out.println("custId = " + customer.getCustId());
        System.out.println("custName = " + customer.custName);
    }
}
