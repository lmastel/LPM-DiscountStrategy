
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Receipt {
    private String productId;
    private int quantity;
    
    public Receipt (){
        
    }
    
    // Here's how Receipt class adds a purchased product as a LineItem
    // Note that the Receipt must have a LineItem[]  lineItems array property
    public void addLineItem(String productId, int quantity) {
        System.out.println("[Receipt] addLineItem productId= " + productId);
        System.out.println("[Receipt] addLineItem quantity= " + quantity);
        LineItem item = new LineItem(productId, quantity);
        
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        
        receipt.setProductId("A101");
        receipt.setQuantity(10);
        
        
        System.out.println("productId = " + receipt.getProductId());
        System.out.println("quantity = " + receipt.getQuantity());
    }
}
