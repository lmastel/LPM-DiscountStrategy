
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class CashRegister {
    
    
    
    public CashRegister(){
        
    }
    
    public void startSale(){
        System.out.println("[CashRegister] startSale");
        addItemToSale("A101", 5);
        
    }
        
        
        
        // When adding an item to a sale you need to look up the item in the database
	// Here we use the prodId to find product in the above array
    public void addItemToSale(String prodId, int qty) {
        FakeDatabase db =  new FakeDatabase();
        Product product = db.findProduct(prodId);
        
        // if found, add the lineItem to the receipt
        // but it's the receipt's job to do this!
        if(product != null) {
            System.out.println("product != null");
            Receipt receipt = new Receipt(); //lpm
            receipt.addLineItem(product, qty);
        }
    }
    
    public void endSale(){
        System.out.println("[CashRegister] endSale");
    }
}
