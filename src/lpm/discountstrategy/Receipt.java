package lpm.discountstrategy;

public class Receipt {

    private LineItem[] lineItems = new LineItem[0];
    private String productId;
    private int quantity;
    private Customer customer;
    private String customerId;
    private String customerName;

    public Receipt() {
        //System.out.println("[Receipt] constructor");
    }

    public void addLineItem(String productId, int quantity) {
        LineItem lineitem = new LineItem(productId, quantity);

        addToArray(lineitem);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];

        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);

        tempItems[lineItems.length] = item;

        lineItems = tempItems;
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
        FakeDatabase db = new FakeDatabase();
        customer = new Customer();
        //System.out.println("[Receipt] dblookupCustomer" + customerId);
        customer = db.findCustomer(customerId);
        if (customer != null) { //customer is found in database
//            System.out.println("customer found");
//            System.out.println("" + customer.getCustomerId());
//            System.out.println("" + customer.getCustomerName());
            this.customerId = customer.getCustomerId();
            customerName = customer.getCustomerName();
        }



    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void outputReceiptItems() {
        //System.out.println("[Receipt] outputReceiptItems");
        ReceiptOutputHardCopy out = new ReceiptOutputHardCopy();
        FakeDatabase db = new FakeDatabase();

        //dbLookupCustomer("100");
        out.setCustomerId(customerId);
        out.setCustomerName(customerName);
        out.setCustomerLine();
        
        out.setItemHeader();

        for (LineItem item : lineItems) {
            item.getQuantity();
            Product product = db.findProduct(item.getProductId());
            if (product != null) {
                product.getProductId();
                product.getProductName();

                product.getPrice();
                DiscountStrategy ds = product.getDs();
                ds.getDiscountAmount(quantity, product.getPrice());
//                System.out.println("ds.getDiscountAmount = "
//                        + ds.getDiscountAmount(quantity, product.getPrice()));

                

                out.setProductId(product.getProductId());
                out.setProductName(product.getProductName());
                out.setQuantity(item.getQuantity());
                out.setPrice(product.getPrice());
                out.setDiscountAmount(ds.getDiscountAmount(quantity, product.getPrice()));
                out.setItemLine();
            }
        }
        out.setTotalLine();
    }
    
    
//        System.out.println("lineItems[0].getProductId()" + lineItems[0].getProductId());
//        System.out.println("lineItems[1].getProductId()" + lineItems[1].getProductId());
//        System.out.println("lineItems[2].getProductId()" + lineItems[2].getProductId());
}
//    public static void main(String[] args) {
//        Receipt r = new Receipt();
//        r.addLineItem("A101", 7);
//        r.dbLookupCustomer("200");
//
//    }
//}
