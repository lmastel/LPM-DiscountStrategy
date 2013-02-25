
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public interface DiscountStrategy {

    public abstract double getDiscount();

    public abstract double getDiscountAmount(int quantity, double price);

    public abstract void setDiscount(double discount);  
    
    public abstract void setQuantity (int quantity);
    
    public abstract int getQuantity();
    
    
}
