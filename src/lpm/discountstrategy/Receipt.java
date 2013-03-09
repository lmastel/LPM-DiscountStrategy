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
     * Constructor Validates that the customer exists in the customer database.
     *
     * @param customerId customer id(identification) passed
     */
    public Receipt(String customerId) {
        if (customerId.isEmpty()) {
            System.out.println("Class Receipt, method Receipt");
            System.out.println("customer id is missing - enter valid customer id");
            System.exit(1);
        }
        FakeDatabase db = new FakeDatabase();
        customer = db.findCustomer(customerId);

        if (customer == null) { //customer not found in database
            System.out.println("Class Receipt, method Receipt");
            System.out.println("customer id not found in database - enter valid customer id");
            System.exit(1);
        }

    }

    /**
     * Adds a LineItem object to the receipt and stores it in an array for later
     * use.
     *
     * @param product object reference passed that contains product information
     * @param quantity quantity of the product that is being purchased
     */
    public final void addLineItem(Product product, int quantity) {
        if (product == null) {
            System.out.println("Class Receipt, method addLineItem");
            System.out.println("product object reference is missing");
            System.exit(1);
        }

        if (quantity <= 0) {
            System.out.println("Class Receipt, method addLineItem");
            System.out.println("quantity is less than or equal to 0");
            System.exit(1);
        }

        LineItem lineitem = new LineItem(product, quantity);

        addToArray(lineitem);
    }

    /**
     * Adds LineItem object to an array and resizes the array as each item is
     * added to the receipt.
     *
     * @param item object reference passed
     */
    public final void addToArray(LineItem item) {
        if (item == null) {
            System.out.println("Class Receipt, method addToArray");
            System.out.println("item object reference is missing");
            System.exit(1);
        }
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

        out.setCustomerLine(customer.getCustomerId(), customer.getCustomerName());

        out.setItemHeader();

        for (LineItem item : lineItems) {
            out.setItemLine(item);
        }
        
        out.setTotalLine();

    }
}
