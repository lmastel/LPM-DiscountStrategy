
package lpm.discountstrategy;

 /**
 * ReceiptOutputStrategy class for Discount Strategy Project
 * 
 * Strategy Interface that allows for multiple concrete implementations
 * to output receipt information via hardcopy, screen display, email, etc.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public interface ReceiptOutputStrategy {
 
    /**
     * 
     * @param customerID    customer id (identification)
     * @param customerName  customer name
     */
    public abstract void setCustomerLine(String customerID, String customerName);
    
    public abstract void setItemHeader();
    /**
     * 
     * @param lineitem object reference
     */
    public abstract void setItemLine(LineItem lineitem);
    
    public abstract void setTotalLine();
}
