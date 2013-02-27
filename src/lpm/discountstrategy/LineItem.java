package lpm.discountstrategy;

public class LineItem {

    private Product product;
    
    private String productId;
    private String productName;
    private int quantity;
    private double price;
    private double extendedPrice;
    private double discountAmount;
    private double discountedPrice;

    public LineItem(String productId, int quantity) {
        System.out.println("[LineItem] constructor");

        this.productId = productId;
        this.quantity = quantity;

        dbLookupProduct(productId, quantity);

    }

    public void dbLookupProduct(String productId, int quantity) {
        System.out.println("[LineItem]exec FakeDB");
        FakeDatabase db = new FakeDatabase();
        product = new Product();
        product = db.findProduct(productId);
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.extendedPrice = quantity * price;
        product.setQuantity(quantity);
        this.discountAmount = product.getDiscountAmount(quantity, price);
        this.discountedPrice = extendedPrice - discountAmount;  

    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        //Product p = new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5));
        LineItem li = new LineItem("A101", 7);
    }
}
