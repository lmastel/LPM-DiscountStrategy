
package lpm.discountstrategy;


public class Startup {
/**
 * Startup class for Discount Strategy Project
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
    
    public static void main(String[] args) {
        //System.out.println("[Startup] main");
        CashRegister cashregister = new CashRegister();
        
        cashregister.startSale();
        
        cashregister.endSale();
    }
}
