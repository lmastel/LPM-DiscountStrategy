package lpm.discountstrategy;

public class CashRegister {
    // Don't want these
//    public static int quantity;
//    public static String productId;
//    private String customerId;
//    private String customerName;
    
    // You want this
    private Receipt receipt;
    
    public CashRegister() {
    }

    public void startSale() {
        System.out.println("[CashRegister] startSale");
        System.out.println("");
        
//        receipt = new Receipt(); orig
         
        receipt = new Receipt("100");
        
        
              
        //addItemToSale(productId, quantity);
        addItemToSale("A101",10);       
        
        addItemToSale("B205", 6);       
        
        addItemToSale("C222", 12);    
        
    }

    public void addItemToSale(String productId, int quantity) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(productId);

        if (product != null) { //product found in database
            receipt.addLineItem(product, quantity);
        } else {
            System.out.println("Invalid productId - item void");
        }
    }

    public void endSale() {        
        receipt.outputReceiptItems();
        System.out.println("");
        System.out.println("Thanks for shopping at Java*Mart");
        System.out.println("");
        System.out.println("[CashRegister] endSale");
    }
}

