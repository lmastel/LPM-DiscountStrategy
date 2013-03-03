
package lpm.discountstrategy;

 /**
 * DiscountStrategy class for Discount Strategy Project
 * 
 * This strategy interface allows for multiple concrete implementations
 * of different types of discounts that are offered on products.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public interface DiscountStrategy {
 

    public abstract double getDiscount();

    public abstract double getDiscountAmount(int quantity, double price);

    public abstract void setDiscount(double discount);  
    
      
}
