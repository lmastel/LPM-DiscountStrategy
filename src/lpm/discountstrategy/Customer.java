package lpm.discountstrategy;
 /**
 * Customer class for Discount Strategy Project
 * 
 * Represents the customer that is making a purchase.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class Customer {
 

    private String customerId;
    private String customerName;
    /**
     * 
     * @param customerId identification of the customer making purchases
     */
    public Customer(String customerId) {
        this.customerId = customerId;
    }    
    
    public Customer(String customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
    }
    /**
     * 
     * @return customer id (identification)
     */
    public String getCustomerId() {
        return customerId;
    }    
    /**
     * 
     * @return customer name associated with customer id
     */
    public String getCustomerName() {
        return customerName;
    }    
}
