package lpm.discountstrategy;

public class ReceiptOutputHardCopy implements ReceiptOutputStrategy {

    private String customerNumber;
    private String customerName;
    private String productId;
    private String productName;
    private int quantity;
    private double price;
    private double extendedPrice;
    private double discountAmount;
    private double discountedPrice;
    
    @Override
    public void setCustomerLine(){
        System.out.println("cid " + customerNumber + " " + customerName);
}
    
    @Override
    public void setItemHeader(){
        System.out.println("\t" + " " +
                           "\t" + "\t " +
                           "qty" + "\t" +
                           "price" + "\t " +
                           "ext price" + "\t" +
                           "disc" + "\t" +
                           "disc price");
    }
    
    @Override
    public void setItemLine(){
        System.out.println(productId + " " +
                           productName + "\t " +
                           quantity + "\t" +
                           price + "\t " +
                           extendedPrice + "\t\t" +
                           discountAmount + "\t" +
                           discountedPrice);
    }
    
    public static void main(String[] args) {
        ReceiptOutputHardCopy r = new ReceiptOutputHardCopy();
        r.customerNumber = "200";
        r.customerName = "Sally Jones";
        r.productId = "C222";
        r.productName = "Women's Socks";
        r.quantity = 6;
        r.price = 9.50;
        r.extendedPrice = 57.00;
        r.discountAmount = 12.00;
        r.discountedPrice= 45.00;
        
        r.setCustomerLine();
        r.setItemHeader();
        r.setItemLine();
    }
}


