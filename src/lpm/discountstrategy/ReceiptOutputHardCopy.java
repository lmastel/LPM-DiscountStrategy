package lpm.discountstrategy;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    
//    public ReceiptOutputHardCopy(LineItem lineitem){
//        lineitem.
//    }
    public LineItem lineitem;
    
    public void setLineItemInfo(LineItem lineitem){
        this.lineitem = lineitem;        
    }
    
    @Override
    public void setCustomerLine(String customerId, String customerName){
        String format = "MM/dd/yyyy hh:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar c = Calendar.getInstance();
        Date date = new Date();
        date = c.getTime();
        String formattedDate = sdf.format(date);
//        + formattedDate
        
        System.out.println("cid " + 
                customerId + 
                " " + 
                customerName +
                "  " +
                formattedDate);
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
    public void setItemLine(LineItem lineitem){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        String priceString = currency.format(lineitem.getPrice());
        
        String extendedPriceString = currency.format(lineitem.getPrice() * lineitem.getQuantity());
      
        String discountAmountString = currency.format(lineitem.getDiscountAmount());        
        
        String discountedPriceString = currency.format((lineitem.getPrice() * lineitem.getQuantity()) -
               lineitem.getDiscountAmount());
        
        totalExtendedPrice += lineitem.getPrice() * lineitem.getQuantity();
        totalDiscountAmount += lineitem.getDiscountAmount();
        totalDiscountedPrice += (lineitem.getPrice() * lineitem.getQuantity())
                - lineitem.getDiscountAmount();
        
        
        System.out.println(lineitem.getProductId() + " " +
                           lineitem.getProductName() + "\t" +
                           lineitem.getQuantity() + "\t" +
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
    
    

    
    
//    public static void main(String[] args) {
//        ReceiptOutputHardCopy r = new ReceiptOutputHardCopy();
//        r.customerId = "200";
//        r.customerName = "Sally Jones";
//        r.productId = "C222";
//        r.productName = "Women's Socks";
//        r.quantity = 6;
//        r.price = 9.50;
//        r.extendedPrice = 57.00;
//        r.discountAmount = 12.00;
//        r.discountedPrice= 45.00;
//        
//        r.setCustomerLine();
//        r.setItemHeader();
//        r.setItemLine();
//    }
}


