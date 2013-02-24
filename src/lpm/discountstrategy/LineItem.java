
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class LineItem {
   //private Product product;
   //private int quantity;
    
    public LineItem(Product product, int quantity){
        System.out.println("[LineItem constructor]");
        //this.product = product;
        //this.quantity = quantity;
        Product p = new Product("A101","Baseball Hat",19.95, new FlatRateDiscount(0.15));
        
    }

    //public Product(String productId, String productName, double price, DiscountStrategy discount) 

        
//    public static void main(String[] args) {
//        LineItem lineitem = new LineItem("A101", 10)
//        
//        System.out.println("productId = " + lineitem.getProductId());
//        System.out.println("quantity = " + lineitem.getQuantity());
//        
//    }
    
    
    
}
