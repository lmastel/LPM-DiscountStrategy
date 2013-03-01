package lpm.discountstrategy;

public class QuantityDiscount implements DiscountStrategy {

    private double discount = 0;
    private int minimumQuantity = 0;
    private int quantity;

    public QuantityDiscount(double discount, int minimumQuantity) {
        this.discount = discount;
        this.minimumQuantity = minimumQuantity;
        
        //quantity = CashRegister.quantity;
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

    public static void main(String[] args) {
        //QuantityDiscount qd = new QuantityDiscount(.20,2);
        DiscountStrategy qd = new QuantityDiscount(.20, 2);
        System.out.println("qd.getDiscount " + qd.getDiscount());
        //System.out.println("qd.MinimumQuantity " + qd.getMinimumQuantity());
        System.out.println("qd.getDiscountAmount " + qd.getDiscountAmount(2, 10.00));
    }
}
