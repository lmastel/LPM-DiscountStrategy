package lpm.discountstrategy;

 /**
 * Product class for Discount Strategy Project
 * 
 * This class represents a product that is being purchased by the customer.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class Product {  
 
    private String productId;
    private String productName;
    private double price;
    private DiscountStrategy ds;
    
    private int quantity;    
    /**
     * Constructor
     * 
     * @param productId    product id (identification)
     * @param productName  product name 
     * @param price        price of the product before any discounts are applied
     * @param ds           discount strategy object reference 
     */
    public Product(String productId, String productName, double price, DiscountStrategy ds) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.ds = ds;
    }    
    /**
     * Gets discount amount.
     * 
     * @param quantity of the product being purchased
     * @return discount expressed as a dollar amount
     */
    public double getDiscountAmount(int quantity){
         return ds.getDiscountAmount(quantity, price);
    }
    /**
     * Gets product id.
     * 
     * @return product id 
     */
    public String getProductId() {
        return productId;
    }
    /**
     * Sets quantity.
     * 
     * @param quantity quantity of the product being purchased
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    
    /**
     * Gets quantity.
     * 
     * @return quantity of the product being purchased
     */
    public int getQuantity() {
        return quantity;
    }
    /**
     * Gets product name.
     * 
     * @return product name 
     */
    public String getProductName() {
        return productName;
    }
    /**
     * Gets price.
     * 
     * @return price of product before any discounts are applied  
     */
    public double getPrice() {
        return price;
    }
    /**
     * Gets discount strategy.
     * 
     * @return discount strategy object reference
     */
    public DiscountStrategy getDs() {
        return ds;
    }


    
}
