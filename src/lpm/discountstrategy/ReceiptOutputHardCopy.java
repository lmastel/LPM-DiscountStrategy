package lpm.discountstrategy;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


 /**
 * ReceiptOutputHardCopy class for Discount Strategy Project
 * 
 * Concrete implementation of the ReceiptOutputStrategy Interface that
 * outputs receipt information to a hardcopy paper receipt
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */

public class ReceiptOutputHardCopy implements ReceiptOutputStrategy {
     
    private double totalExtendedPrice = 0;   //accum for extended price 
    private double totalDiscountAmount = 0;  //accum for discounted amount
    private double totalDiscountedPrice = 0; //accum for discounted price
    
    public LineItem lineitem;
    /**
     * 
     * @param lineitem object reference passed to allow access to data needed 
     * for printing the receipt
     */    
        public void setLineItemInfo(LineItem lineitem){
            if (lineitem == null ){
            System.out.println("lineitem is missing");
            System.exit(1);}
        this.lineitem = lineitem;        
    }
    
    /**
     * Formats and outputs customer info and current date and time
     * 
     * @param customerId    customer id passed for printing on receipt
     * @param customerName  customer name passed for printing on receipt 
     */
    @Override
    public void setCustomerLine(String customerId, String customerName){
        if (customerId.isEmpty()){
            System.out.println("customer id is missing");
            System.exit(1);    
        }
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
    /**
     * Formats and outputs item headings
     */
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
    /**
     * Formats and outputs line item information
     * 
     * @param lineitem object reference passed to allow access to information
     * needed to print an individual line item on the receipt
     */
    @Override
    public void setItemLine(LineItem lineitem){
        if (lineitem == null ){
            System.out.println("lineitem is missing");
            System.exit(1);}
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
    /**
     * Formats and outputs the total line on the receipt.
     */
    @Override
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
    
 
}


