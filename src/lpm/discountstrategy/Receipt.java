package lpm.discountstrategy;

public class Receipt {

    private LineItem[] lineItems = {};
    
    private String productId;
    private int quantity;
    private Customer customer;
    private String customerName;

    public Receipt() {
    }

    public void addLineItem(String productId, int quantity) {
        //LineItem item = new LineItem(product, qty);
//        System.out.println("[Receipt] addLineItem quantity= " + quantity + " product= " + product);
        LineItem item = new LineItem(productId, quantity);
        System.out.println("[Receipt] addLineItem " + item);
        addToArray(item);
        item.setProductId(productId);
        item.setQuantity(quantity);
    }

    private void addToArray(LineItem item) {
        System.out.println("[Receipt] addToArray");
        System.out.println("[Receipt] addToArray " + item);
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        System.out.println("[Receipt] addToArray lineItems[0]" + lineItems[0]);
        //System.out.println("[Receipt] addToArray lineItems[1]" + lineItems[1]);
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void dbLookupCustomer(String customerId) {
        System.out.println("[Receipt] calls FakeDB");
        FakeDatabase db = new FakeDatabase();
        customer = new Customer();
        customer = db.findCustomer(customerId);
        System.out.println("customer.getCustomerId()" + customer.getCustomerId());
        System.out.println("customer.getCustomerName()" + customer.getCustomerName());
    }

    public void outputReceiptItems(){
        ReceiptOutputHardCopy o = new ReceiptOutputHardCopy();
        
        o.setCustomerLine();
        o.setItemHeader();
        o.setItemLine();
    }
    
    public static void main(String[] args) {
        Receipt r = new Receipt();
        r.addLineItem("A101", 7);
        r.dbLookupCustomer("200");

    }
}
