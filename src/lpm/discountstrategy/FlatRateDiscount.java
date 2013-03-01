package lpm.discountstrategy;

public class FlatRateDiscount implements DiscountStrategy {

    private double discount = .15;
    //private int quantity;

    public FlatRateDiscount(double discount) {
        //System.out.println("[FlatRateDiscount] constructor");
        this.discount = discount;

        //quantity = CashRegister.quantity;
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

    public static void main(String[] args) {
        //FlatRateDiscount frd = new FlatRateDiscount(.15);
        DiscountStrategy frd = new FlatRateDiscount(.15);
        System.out.println("frd.getDiscount " + frd.getDiscount());
        System.out.println("frd.getDiscountAmount " + frd.getDiscountAmount(10, 10.00));
    }
}
