package lpm.discountstrategy;
 /**
 * LineItem class for Discount Strategy Project
 * 
 * This class represents one line item, product and quantity of the product,
 * that is being purchased by the customer.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class LineItem {
 

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductId() {
        return product.getProductId();
    }

    public String getProductName() {
        return product.getProductName();
    }

    public double getPrice() {
        return product.getPrice();
    }
    
    public double getDiscountAmount(){
        return product.getDiscountAmount(quantity);
    }    
}
