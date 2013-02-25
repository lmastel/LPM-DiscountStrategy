package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Product {

    private int quantity;
    private String productId;
    private String productName;
    private double price;
    private DiscountStrategy ds;

    //public Product(String productId, String productName, double price, double discount){
    public Product(String productId, String productName, double price, DiscountStrategy ds) {
        //new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10,5)),
        System.out.println("[Product] constructor");
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.ds = ds;
    }

    public String getProductId() {
        return productId;
    }

    public static void main(String[] args) {
        Product p = new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5));
        QuantityDiscount ds = new QuantityDiscount(.10, 2);
        System.out.println("ds.getDiscount " + ds.getDiscount());
        System.out.println("[Product] constructor discount amount  =" + ds.getDiscountAmount(7, 10.00));

    }
}
