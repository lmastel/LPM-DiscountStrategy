
package lpm.discountstrategy;


public class Startup {

    
    public static void main(String[] args) {
        System.out.println("[Startup] main");
        CashRegister cashregister = new CashRegister();
        
        cashregister.startSale();
        
        cashregister.endSale();
    }
}
