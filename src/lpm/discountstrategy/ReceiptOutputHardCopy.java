package lpm.discountstrategy;

import java.text.NumberFormat;

public class ReceiptOutputHardCopy implements ReceiptOutputStrategy {

    private String customerId;
    private String customerName;
    private String productId;
    private String productName;
    private int quantity;
    private double price;
    private double extendedPrice;
    private double discountAmount;
    private double discountedPrice;
    
    private double totalExtendedPrice = 0;
    private double totalDiscountAmount = 0;
    private double totalDiscountedPrice = 0;
    
    
    
    @Override
    public void setCustomerLine(){
        System.out.println("cid " + customerId + " " + customerName);
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
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceString = currency.format(price);
        String extendedPriceString = currency.format(getExtendedPrice());
        String discountAmountString = currency.format(discountAmount);
        String discountedPriceString = currency.format(getDiscountedPrice());
        
        totalExtendedPrice += getExtendedPrice();
        totalDiscountAmount += discountAmount;
        totalDiscountedPrice += getDiscountedPrice();
        
        
        System.out.println(productId + " " +
                           productName + "\t" +
                           quantity + "\t" +
                           priceString + "\t" +
                           extendedPriceString + "\t\t" +
                           discountAmountString + "\t" +
                           discountedPriceString);
    }

    public void setTotalLine(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String totalExtendedPriceString = currency.format(totalExtendedPrice);
        String totalDiscountAmountString = currency.format(totalDiscountAmount);
        String totalDiscountedPriceString = currency.format(totalDiscountedPrice);
        
        System.out.println("\t\t\t\t" +
                           "TOTAL\t " +
                           totalExtendedPriceString + "\t" +
                           totalDiscountAmountString + "\t" +
                           totalDiscountedPriceString);
        
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getExtendedPrice() {
        return quantity * price;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountedPrice() {
        return getExtendedPrice() - discountAmount;
    }
    
    
    
    public static void main(String[] args) {
        ReceiptOutputHardCopy r = new ReceiptOutputHardCopy();
        r.customerId = "200";
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


