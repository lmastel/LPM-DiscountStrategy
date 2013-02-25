package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class FlatRateDiscount implements DiscountStrategy {

    private double flatRateDiscount = .15;
    private int quantity;

    public FlatRateDiscount(double flatRateDiscount) {
        System.out.println("[FlatRateDiscount] constructor");
        this.flatRateDiscount = flatRateDiscount;
    }

    @Override
    public double getDiscount() {
        return flatRateDiscount;
    }

    @Override
    public double getDiscountAmount(int quantity, double price) {
        return quantity * price * flatRateDiscount;
    }

    @Override
    public void setDiscount(double discount) {
        this.flatRateDiscount = discount;
    }

//    public static void main(String[] args) {
//        //FlatRateDiscount frd = new FlatRateDiscount(.15);
//        DiscountStrategy frd = new FlatRateDiscount(.15);
//        System.out.println("frd.getDiscount " + frd.getDiscount());
//        System.out.println("frd.getDiscountAmount " + frd.getDiscountAmount(10, 10.00));
//    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
         
    
}
