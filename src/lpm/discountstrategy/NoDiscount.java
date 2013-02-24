
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class NoDiscount implements DiscountStrategy {
    private double noDiscount = 0;    
    
    public NoDiscount(double noDiscount) {
        this.noDiscount = 0;
    }

    public void setNoDiscount(double noDiscount) {
        this.noDiscount = 0;
    }
    
    

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public double getDiscountAmount(int quantity, double price) {
        return 0;
    }

    @Override
    public void setDiscount(double discount) {
        this.noDiscount = 0;
    }
    
    public static void main(String[] args) {
        //NoDiscount nd = new NoDiscount(.10);
        DiscountStrategy nd = new NoDiscount(.10);
        System.out.println("nd.getDiscount " + nd.getDiscount());
        System.out.println("nd.getDiscountAmount " + nd.getDiscountAmount(10, 10.00));
    }      
}
