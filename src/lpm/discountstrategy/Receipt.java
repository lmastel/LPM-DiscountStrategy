
package lpm.discountstrategy;

/**
 *
 * @author LPM
 */
public class Receipt {
    private String productId;
    private int quantity;
    
    private LineItem[] lineItems = {};
    
    private Customer customer;
    
    public Receipt (){
       
    }
    
    // Here's how Receipt class adds a purchased product as a LineItem
    // Note that the Receipt must have a LineItem[]  lineItems array property
    public void addLineItem(Product product, int quantity) {
        //LineItem item = new LineItem(product, qty);
        System.out.println("[Receipt] addLineItem product= " + product);
        System.out.println("[Receipt] addLineItem quantity= " + quantity);
        LineItem item = new LineItem(product, quantity);
        addToArray(item);
        //Product prod = new Product(item);
    }

    // Since arrays are fixed in size, to add a new element you must resize
    // the array, but wait, you can't do that in Java! Well, you can fake it. Here's how:
    // Create a new temporary array that's one larger than the original. Then,
    // copy all the data from the original into the temporary array.
    // Finally, add the new item to the new element in the temporary array. Then,
    // set the original = temporary. That's it!
    private void addToArray(LineItem item) {
        System.out.println("[Receipt] addToArray");
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

}
