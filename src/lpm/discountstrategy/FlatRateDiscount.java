package lpm.discountstrategy;
 /**
 * FlatRateDiscount class for Discount Strategy Project
 * 
 * This class is the concrete implementation of a discount strategy
 * for products that are eligible for a flat rate discount.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class FlatRateDiscount implements DiscountStrategy {
 

    private double discount = .15;
    /**
     * Constructor
     * @param discount expressed as a decimal
     */
    public FlatRateDiscount(double discount) {       
        this.discount = discount;
    }
    /**
     * Returns discount.
     * 
     * @return discount expressed as a decimal
     */
    @Override
    public double getDiscount() {
        return discount;
    }
    /**
     * 
     * @param quantity quantity of product being purchased  
     * @param price    price, before any discount, of the product being purchased
     * @return         discount expressed as a dollar amount
     */
    @Override
    public double getDiscountAmount(int quantity, double price) {
        return quantity * price * discount;
    }
    /**
     * Sets the discount.
     * 
     * @param discount discount expressed as a decimal
     */
    @Override    
    public void setDiscount(double discount) {
        this.discount = discount;
    }    
}
