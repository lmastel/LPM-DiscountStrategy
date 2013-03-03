package lpm.discountstrategy;
 /**
 * QuantityDiscount class for Discount Strategy Project
 * 
 * This class is the concrete implementation of a discount strategy
 * for products that are eligible for a quantity discount.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class QuantityDiscount implements DiscountStrategy {
 

    private double discount = 0;
    private int minimumQuantity = 0;
    
    /**
     * 
     * @param discount         decimal representing the percent of discount
     * @param minimumQuantity  minimum quantity of product purchase to obtain discount 
     */
    public QuantityDiscount(double discount, int minimumQuantity) {
        this.discount = discount;
        this.minimumQuantity = minimumQuantity;
        
    }
    /**
     * 
     * @return discount expressed as a decimal
     */
    @Override
    public double getDiscount() {
        return discount;
    }
    /**
     * Gets the discount amount.
     * Minimum quantity or greater must be purchased to obtain discount.
     * 
     * @param quantity quantity of product being purchased 
     * @param price    price, before any discount, of the product being purchased
     * @return         discount expressed as a dollar amount
     */
    @Override
    public double getDiscountAmount(int quantity, double price) {
        
        if (quantity >= minimumQuantity) {
            return quantity * price * discount;
        } else {
            return 0;
        }
    }
    /**
     * Sets the discount.
     * 
     * @param discount  expressed as a decimal
     */
    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * 
     * @return minimum quantity
     */
    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets minimum quantity.
     * 
     * @param minimumQuantity  
     */
    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

}
