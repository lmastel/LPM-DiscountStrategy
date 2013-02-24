package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class QuantityDiscount implements DiscountStrategy {

    private double quantityDiscount = 0;
    private int minimumQuantity = 0;

    public QuantityDiscount(double quantityDiscount, int minimumQuantity) {
        this.quantityDiscount = quantityDiscount;
        this.minimumQuantity = minimumQuantity;
    }

    @Override
    public double getDiscount() {
        return quantityDiscount;
    }

    @Override
    public double getDiscountAmount(int quantity, double price) {
        if (quantity >= minimumQuantity) {
            return quantity * price * quantityDiscount;
        } else {
            return 0;
        }
    }

    @Override
    public void setDiscount(double discount) {
        this.quantityDiscount = discount;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }
    
    public static void main(String[] args) {
        //QuantityDiscount qd = new QuantityDiscount(.20,2);
        DiscountStrategy qd = new QuantityDiscount(.20,2);
        System.out.println("qd.getDiscount " + qd.getDiscount());
        //System.out.println("qd.MinimumQuantity " + qd.getMinimumQuantity());
        System.out.println("qd.getDiscountAmount " + qd.getDiscountAmount(2, 10.00));
    }
            
    
}
