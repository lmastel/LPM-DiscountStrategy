package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class LineItem {

    private static Product product;
    private int quantity;
    private String prodId = "C222"; //for db lookup
    
    
    private LineItem[] lineItems = {};

    public LineItem(Product product, int quantity) {
        System.out.println("[LineItem] constructor");
        this.product = product;
        this.quantity = quantity;
        System.out.println("[LineItem] constuctor product= " + product);
        System.out.println("[LineItem] constuctor quantity= " + quantity);
        //addLineItem(product, quantity);
        dbLookupProduct("C222", 6);
    }

     public void dbLookupProduct(String prodId, int qty) {
        FakeDatabase db =  new FakeDatabase();
        Product product = db.findProduct(prodId);
        
        if(product != null) {
            System.out.println("[LineItem] dbLookupProduct != null");            
            System.out.println("[LineItem] dblookupProduct product.toString " + product.toString());
        }
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    
     public static void main(String[] args) {
        product = new Product("A101", "Baseball Hat", 19.95, new FlatRateDiscount(.5));
        LineItem li = new LineItem(product, 6);
        
    }
    }
