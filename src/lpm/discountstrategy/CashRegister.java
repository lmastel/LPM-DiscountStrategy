package lpm.discountstrategy;

public class CashRegister {

    public static int quantity;
    public static String productId;
    private Receipt receipt;

    private String customerId;
    private String customerName;
    
    
    public CashRegister() {
    }

    public void startSale() {
        System.out.println("[CashRegister] startSale");
        
        receipt = new Receipt();
        
        productId = "A101";
        quantity = 10;        
        addItemToSale(productId, quantity);
        
        productId = "B205";
        quantity = 6;
        addItemToSale(productId, quantity);
        
        productId = "C222";
        quantity = 12;
        addItemToSale(productId, quantity);    
        
    }

    public void addItemToSale(String productId, int quantity) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(productId);

        if (product != null) { //product found in database
            receipt.setProductId(productId);
            receipt.setQuantity(quantity);
            receipt.addLineItem(productId, quantity);
        } else {
            System.out.println("Invalid product ID - item void");
        }

    }

    public void endSale() {
        receipt.dbLookupCustomer("100");   
        //receipt.setCustomerName(customerName);
        
        receipt.outputReceiptItems();
        System.out.println("[CashRegister] endSale");
    }
}
//    public static void main(String[] args) {
//        CashRegister cr = new CashRegister();
//        Receipt r = new Receipt();
//        r.addLineItem(productId, quantity);
//    }
//}
