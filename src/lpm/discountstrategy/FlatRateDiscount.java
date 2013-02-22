
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class FlatRateDiscount implements DiscountStrategy {
    private double flatRateDiscount = .10;    
    
    @Override
    public double getDiscountAmount (int quantity, double price){
        return quantity * price * flatRateDiscount;
    }

    @Override
    public double getDiscount() {
        return flatRateDiscount;
    }

    @Override
    public void setDiscount(double flatRateDiscount) {
        this.flatRateDiscount = flatRateDiscount;
    }
 
    public static void main(String[] args) {
        //FlatRateDiscount frd = new FlatRateDiscount();
        DiscountStrategy frd = new FlatRateDiscount();
        System.out.println("Flat Rate Discount Amount = " +
        frd.getDiscountAmount(11, 5.00));
    }
}
