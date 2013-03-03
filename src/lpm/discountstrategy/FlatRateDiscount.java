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
    
    public FlatRateDiscount(double discount) {       
        this.discount = discount;
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public double getDiscountAmount(int quantity, double price) {
        return quantity * price * discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }    
}
