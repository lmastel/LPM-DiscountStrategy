
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class LineItem {
    private String productId;
    private int quantity;
    
    public LineItem(String productId, int quantity){
        this.productId = productId;
        this.quantity = quantity;
        System.out.println("[LineItem constructor] productId= " + productId);
        System.out.println("[LineItem constructor] quantity= " + quantity);
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
        LineItem lineitem = new LineItem("A101", 10);
        
        System.out.println("productId = " + lineitem.getProductId());
        System.out.println("quantity = " + lineitem.getQuantity());
        
    }
    
    
    
}
