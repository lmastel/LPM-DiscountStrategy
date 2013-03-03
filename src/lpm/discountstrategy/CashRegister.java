package lpm.discountstrategy;
 /**
 * CashRegister class for Discount Strategy Project
 * 
 * This class represents the functions of a cash register
 * in recording a customer's purchase.
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class CashRegister {
 
    
    private Receipt receipt;
    
    public CashRegister() {
    }
    /**
     * Starts the sale by creating a receipt. 
     * Adds items to the sale by scanning the product being purchased 
     * to obtain product id and the
     * quantity of the item being purchased 
     */
    public void startSale() {
        System.out.println("[CashRegister] startSale");
        System.out.println(""); 
         
        //receipt = new Receipt(customerId);  
        receipt = new Receipt("100");
              
        //addItemToSale(productId, quantity);
        addItemToSale("A101",10);       
        
        addItemToSale("B205", 6);       
        
        addItemToSale("C222", 12);    
        
    }
/**
 * Adds items to the sale after validating that the product exists in the product database
 * 
 * @param productId  product identification scanned from product being purchased
 * @param quantity   quantity of product scanned
 */
    public void addItemToSale(String productId, int quantity) {
        FakeDatabase db = new FakeDatabase();
        Product product = db.findProduct(productId);

        if (product != null) { //product found in database
            receipt.addLineItem(product, quantity);
        } else {
            System.out.println("Invalid productId - item void");
        }
    }
/**
 * Closes sale by outputting a receipt for the customer
 */
    public void endSale() {        
        receipt.outputReceiptItems();
        System.out.println("");
        System.out.println("Thanks for shopping at Java*Mart");
        System.out.println("");
        System.out.println("[CashRegister] endSale");
    }
}

