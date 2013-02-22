
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class QuantityDiscount implements DiscountStrategy {
    private double quantityDiscount = .20;   
    private int minimumQuantity = 2;
    
    public double getDiscountAmount (int quantity, double price){
        if (quantity >= minimumQuantity){
            return quantity * price * quantityDiscount;
        } else{
            return 0;
        }
        
    }

    public double getDiscount() {
        return quantityDiscount;
    }

    public void setDiscount(double quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }
 
    public static void main(String[] args) {
        //QuantityDiscount qd = new QuantityDiscount();
        DiscountStrategy qd = new QuantityDiscount();
        System.out.println("Quantity Discount Amount = " +
        qd.getDiscountAmount(2, 10.00));
    }

    

    
}
