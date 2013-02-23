
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
        Receipt receipt = new Receipt();
        
        receipt.addLineItem("A101", 10);
    }
    
    public void endSale(){
        System.out.println("[CashRegister] endSale");
    }
}
