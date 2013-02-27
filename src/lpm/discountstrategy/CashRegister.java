package lpm.discountstrategy;

public class CashRegister {

    public static int quantity;
    public static String productId;
    private Receipt receipt;

    public CashRegister() {
    }

    public void startSale() {
        System.out.println("[CashRegister] startSale");

        productId = "B205";
        quantity = 7;

        receipt = new Receipt();
        receipt.setProductId(productId);
        receipt.setQuantity(quantity);
        receipt.addLineItem(productId, quantity);
    }

    public void endSale() {
        System.out.println("[CashRegister] endSale");
    }
    
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        Receipt r = new Receipt();
        r.addLineItem(productId, quantity);
    }
}

