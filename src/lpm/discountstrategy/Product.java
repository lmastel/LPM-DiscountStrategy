package lpm.discountstrategy;


public class Product {

    private int quantity;
    private String productId;
    private String productName;
    private double price;
    private DiscountStrategy ds;
    
    public Product(String productId, String productName, double price, DiscountStrategy ds) {
        //new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10,5)),
        //System.out.println("[Product] constructor");
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.ds = ds;
    }
    
    public Product(){
        
    }

    public double getDiscountAmount(int quantity, double price){
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
    
    

    public static void main(String[] args) {
        Product p = new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5));
        QuantityDiscount ds = new QuantityDiscount(.10, 2);
        System.out.println("ds.getDiscount " + ds.getDiscount());
        System.out.println("[Product] constructor discount amount  =" + ds.getDiscountAmount(7, 10.00));

    }
}
