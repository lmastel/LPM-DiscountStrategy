
package lpm.discountstrategy;

 /**
 * NoDiscount class for Discount Strategy Project
 * 
 * This class is the concrete implementation of a discount strategy
 * for products that are NOT eligible for any discount.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class NoDiscount implements DiscountStrategy { 
    
    /**
     * Constructor
     */
    public NoDiscount() {
        
    }

    /**
     * Gets discount.
     * @return discount expressed as a decimal, always 0(zero) 
     */
    @Override
    public final double getDiscount() {
        return 0;
    }
    /**
     * Gets discount amount.
     * 
     * @param quantity
     * @param price
     * @return          discount expressed as a dollar amount, always 0(zero)
     */
    @Override
    public final double getDiscountAmount(int quantity, double price) {
        return 0;
    }
    /**
     * Does not allow a discount to be set on a no discount product
     * @param discount 
     */
    @Override
    public final void setDiscount(double discount) {
        
    }
    
    
}
