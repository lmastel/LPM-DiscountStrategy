package lpm.discountstrategy;
 /**
 * Receipt class for Discount Strategy Project
 * 
 * This class represents items that will appear on lines on a receipt.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class Receipt {
 
 
    private LineItem[] lineItems = new LineItem[0];
    private Customer customer;
    /**
     * Constructor
     * Validates that the customer exists in the customer database.
     * @param customerId cutomer id(identification) passed 
     */
    public Receipt(String customerId) {
        FakeDatabase db = new FakeDatabase();
        customer = db.findCustomer(customerId);
    }

    /**
     * Adds a LineItem object to the receipt and stores it in an array for
     * later use.
     * 
     * @param product    object reference passed that contains   product information
     * @param quantity   quantity of the product that is being purchased
     */
    public void addLineItem(Product product, int quantity) {

        LineItem lineitem = new LineItem(product, quantity);

        addToArray(lineitem);
    }
    /**
     * Adds LineItem object to an array and resizes the array as each item is
     * added to the receipt.
     * 
     * @param item  object reference passed
     */
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];

        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);

        tempItems[lineItems.length] = item;

        lineItems = tempItems;
    }

    /**
     * Outputs receipt items to the appropriate output device at end of sale.
     */
    public void outputReceiptItems() {
        
        ReceiptOutputStrategy out = new ReceiptOutputHardCopy();

        out.setCustomerLine(customer.getCustomerId(),customer.getCustomerName());

        out.setItemHeader();        

        for (LineItem item : lineItems) {
            out.setItemLine(item);
        }

    }
}
