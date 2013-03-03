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
    

    public QuantityDiscount(double discount, int minimumQuantity) {
        this.discount = discount;
        this.minimumQuantity = minimumQuantity;
        
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public double getDiscountAmount(int quantity, double price) {
        
        if (quantity >= minimumQuantity) {
            return quantity * price * discount;
        } else {
            return 0;
        }
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

}
