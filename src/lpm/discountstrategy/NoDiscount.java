
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
 
    
    
    public NoDiscount() {
        //System.out.println("[NoDiscount] constructor");
        //this.noDiscount = 0;
    }

    public void setNoDiscount(double noDiscount) {
        //this.noDiscount = 0;
    }
    
    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public double getDiscountAmount(int quantity, double price) {
        return 0;
    }

    @Override
    public void setDiscount(double discount) {
        //this.noDiscount = 0;
    }
    
    
}
