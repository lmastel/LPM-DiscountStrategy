
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Startup {

    
    public static void main(String[] args) {
        CashRegister cashregister = new CashRegister();
        
        cashregister.startSale();
        
        cashregister.endSale();
    }
}
