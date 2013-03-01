package lpm.discountstrategy;

public class Receipt {
    // don't want these
//    private String productId;
//    private int quantity;
//    private String customerId;
//    private String customerName;

    // must have these
    private LineItem[] lineItems = new LineItem[0];
    private Customer customer;

    //private Product product;
    public Receipt(String customerId) {
        FakeDatabase db = new FakeDatabase();
        customer = db.findCustomer(customerId);
    }

    // Here's how Receipt class adds a purchased product as a LineItem
    // Note that the Receipt must have a LineItem[]  lineItems array property
    public void addLineItem(Product product, int quantity) {

        LineItem lineitem = new LineItem(product, quantity);

        addToArray(lineitem);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];

        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);

        tempItems[lineItems.length] = item;

        lineItems = tempItems;
    }

    public void outputReceiptItems() {
        //System.out.println("[Receipt] outputReceiptItems");
        ReceiptOutputHardCopy out = new ReceiptOutputHardCopy();

        out.setCustomerLine(customer.getCustomerId(),customer.getCustomerName());

        out.setItemHeader();
        

        for (LineItem item : lineItems) {
            out.setItemLine(item);
        }

    }
}
