package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Receipt {

    private String productId;
    private int quantity;
    private LineItem[] lineItems = {};
    private Customer customer;
    private Product product; // = new Product("A101", "Baseball Hat", 19.95, new FlatRateDiscount(.5));

    public Receipt() {
    }

    // Here's how Receipt class adds a purchased product as a LineItem
    // Note that the Receipt must have a LineItem[]  lineItems array property
    public void addLineItem(Product product, int quantity) {
        //LineItem item = new LineItem(product, qty);
        System.out.println("[Receipt] addLineItem productId " + productId);
        System.out.println("[Receipt] addLineItem product= " + product);
        System.out.println("[Receipt] addLineItem quantity= " + quantity);
        LineItem item = new LineItem(product, quantity);
        item.setProdId(productId);
        item.setQuantity(quantity);
        addToArray(item);

        System.out.println("lineItems[0] " + lineItems[0]);
        
        //System.out.println("lineItems[0] " + lineItems[1]);
        //Product prod = new Product(item);

    }

    // Since arrays are fixed in size, to add a new element you must resize
    // the array, but wait, you can't do that in Java! Well, you can fake it. Here's how:
    // Create a new temporary array that's one larger than the original. Then,
    // copy all the data from the original into the temporary array.
    // Finally, add the new item to the new element in the temporary array. Then,
    // set the original = temporary. That's it!
    private void addToArray(LineItem item) {
        System.out.println("[Receipt] addToArray");
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        System.out.println("[Receipt] addToArray lineItems[0].toString " + lineItems.toString());

    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

//    public String getProductId(){
//        
//    }
    // Here's how to loop through all the line items and get a grand total
//    public double getTotalBeforeDiscount() {
//        double grandTotal = 0.0;
//        for(LineItem item : lineItems) {
//            grandTotal += item.getOrigPriceSubtotal();
//        }
//        return grandTotal;
//    }
    @Override
    public String toString() {
        return "Receipt{" + "productId=" + productId + ", quantity=" + quantity + ", lineItems=" + lineItems + ", customer=" + customer + '}';
    }
//    public static void main(String[] args) {
//        Receipt receipt = new Receipt();
//        receipt.addLineItem(product, 5);
//        
//    }
}
