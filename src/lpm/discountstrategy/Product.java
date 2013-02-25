
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
    private double discountAmount;
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
////        System.out.println("ds.getDiscount " + ds.getDiscount());
////        System.out.println("ds.getDiscountAmount " +  ds.getDiscountAmount(6, 19.95));
////        System.out.println("[Product] constructor productId =" + getProductId());
////        System.out.println("[Product] constructor productName =" + productName);
////        System.out.println("[Product] constructor price =" + price);
            System.out.println("[Product] constructor discount amount  =" + ds.getDiscountAmount(quantity, price));
        
        
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

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", price=" + price + ", ds=" + ds + '}';
    }

   
    
    
//    public static void main(String[] args) {
//        
//        Product p = new Product("A101", "Baseball Hat", 19.95, new NoDiscount());
//        
//        LineItem item = new LineItem(product, qty);        
//     
//    }
        
        
        
}
