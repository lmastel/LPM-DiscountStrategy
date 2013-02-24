
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Product {
    private String productId;
    private String productName;
    private double price;
    private double discount;
    private DiscountStrategy ds;
    
    //public Product(String productId, String productName, double price, double discount){
    public Product(String productId, String productName, double price, DiscountStrategy ds){
        System.out.println("[Product] constructor");
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        //this.discount = discount;
        this.ds = ds;
        //ds.setDiscount(.25);
        System.out.println("ds.getDiscount " + ds.getDiscount());
        System.out.println("ds.getDiscountAmount " +  ds.getDiscountAmount(20, 20.00));
        System.out.println("[Product] constructor productId =" + productId);
        System.out.println("[Product] constructor productName =" + productName);
        System.out.println("[Product] constructor price =" + price);
        System.out.println("[Product] constructor discount =" + discount);
        
        
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

//    public DiscountStrategy getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(DiscountStrategy discount) {
//        this.discount = discount;
//    }
    
    
    
    public static void main(String[] args) {
        
        Product p;
        p = new Product("A101", "Baseball Hat", 19.95, new FlatRateDiscount(.25));
        //FlatRateDiscount frd = new FlatRateDiscount(.15);
//        System.out.println("frd.getDiscount " + frd.getDiscount());
//        System.out.println("frd.getDiscountAmount " + frd.getDiscountAmount(15, 15.00));
        
    }
        
        
        
}
