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
    
    public Product(String productId, String productName, double price, DiscountStrategy ds) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.ds = ds;
    }    

    public double getDiscountAmount(int quantity){
         return ds.getDiscountAmount(quantity, price);
    }
    
    public String getProductId() {
        return productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    
    
    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public DiscountStrategy getDs() {
        return ds;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDs(DiscountStrategy ds) {
        this.ds = ds;
    }
    
}
