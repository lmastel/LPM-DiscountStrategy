
package lpm.discountstrategy;


public interface ReceiptOutputStrategy {
    
    public abstract void setCustomerLine(String customerID, String customerName);
    
    public abstract void setItemHeader();
    
    public abstract void setItemLine(LineItem lineitem);
}
