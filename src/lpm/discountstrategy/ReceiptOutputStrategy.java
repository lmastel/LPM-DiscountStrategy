
package lpm.discountstrategy;


public interface ReceiptOutputStrategy {
    
    public abstract void setCustomerLine();
    
    public abstract void setItemHeader();
    
    public abstract void setItemLine();
}
