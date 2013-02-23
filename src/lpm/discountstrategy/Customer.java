
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Customer {
    private String custId;
    private String custName;
    
    public Customer(String custId, String custName){
        this.custId = custId;
        this.custName = custName;
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
        
        System.out.println("custId = " + customer.getCustId() );
        System.out.println("custName = " + customer.custName );
    }
    
}
