
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Product {
    private String productId;
    private String productName;
    private double price;
    private DiscountStrategy discount;
    
    public Product(String productId, String productName, double price, DiscountStrategy discount){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.discount = discount;        
    }
        

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
    
    public static void main(String[] args) {
        Product p = new Product("A101", "Baseball Hat", 19.95, new FlatRateDiscount(0.15));
        
        System.out.println("productId = " + p.getProductId());
        System.out.println("productName = " + p.productName);
        System.out.println("price = " + p.getPrice());
        
        
        
        
        DiscountStrategy frd = new FlatRateDiscount(.10);
        System.out.println("Discount Amount for Product = " + frd.getDiscountAmount(10, 10.00));
        System.out.println("Discount for Product = " + frd.getDiscount());
        
    }
}
