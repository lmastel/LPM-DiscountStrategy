
package lpm.discountstrategy;

 /**
 * DiscountStrategy class for Discount Strategy Project
 * 
 * This strategy interface allows for multiple concrete implementations
 * of different types of discounts that are offered on products and allows
 * for the addition of new types in the future.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public interface DiscountStrategy {
 

    public abstract double getDiscount();
    /**
     * 
     * @param quantity quantity of product being purchased
     * @param price    price of product before any discounts are applied
     * @return discount amount expressed as a dollar amount
     */
    public abstract double getDiscountAmount(int quantity, double price);

    public abstract void setDiscount(double discount);  
    
      
}
