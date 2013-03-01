package lpm.discountstrategy;

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductId() {
        return product.getProductId();
    }

    public String getProductName() {
        return product.getProductName();
    }

    public double getPrice() {
        return product.getPrice();
    }
    
    public double getDiscountAmount(){
        return product.getDiscountAmount(quantity);
    }

    public static void main(String[] args) {
        Product p = new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5));
        LineItem li = new LineItem(p, 7);
        System.out.println("product = " + li.product);
        System.out.println("quantity = " + li.quantity);

    }
}
