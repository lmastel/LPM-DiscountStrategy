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
    /**
     * Constructor
     * 
     * @param product  product object reference
     * @param quantity quantity of the product being purchased
     */
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;

    }
    /**
     * Gets the quantity.
     * 
     * @return quantity of the item being purchased
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Gets product id.
     * 
     * @return product id (identification)
     */
    public String getProductId() {
        return product.getProductId();
    }
    /**
     * Gets product name.
     * 
     * @return product name
     */
    public String getProductName() {
        return product.getProductName();
    }
    /**
     * Gets price.
     * 
     * @return price of product before any discounts are applied
     */
    public double getPrice() {
        return product.getPrice();
    }
    /**
     * Gets discount amount.
     * 
     * @return discount expressed a a dollar amount
     */
    public double getDiscountAmount(){
        return product.getDiscountAmount(quantity);
    }    
}
