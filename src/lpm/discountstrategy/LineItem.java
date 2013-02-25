package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        System.out.println("[LineItem] constructor");

        this.product = product;
        this.quantity = quantity;

        dbLookupProduct(CashRegister.prodId, CashRegister.quantity);

    }

    public void dbLookupProduct(String prodId, int qty) {
        System.out.println("[LineItem]exec FakeDB");
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(CashRegister.prodId);

        if (product != null) {
            System.out.println("[LineItem] dbLookupProduct != null");
            System.out.println("[LineItem] dbLookupProduct quantity " + quantity);
            System.out.println("[LineItem] dblookupProduct product.toString " + product.toString());

        }
    }

    public static void main(String[] args) {
        Product p = new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5));
        LineItem li = new LineItem(p, 7);
    }
}
