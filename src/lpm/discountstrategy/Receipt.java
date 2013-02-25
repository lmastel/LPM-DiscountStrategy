package lpm.discountstrategy;

public class Receipt {

    private LineItem[] lineItems = {};
    private Product product;
    private int quantity;

    public Receipt() {
    }

    // Here's how Receipt class adds a purchased product as a LineItem
    // Note that the Receipt must have a LineItem[]  lineItems array property
    public void addLineItem(Product product, int quantity) {
        //LineItem item = new LineItem(product, qty);

        LineItem item = new LineItem(product, quantity);

        addToArray(item);

        System.out.println("lineItems[0] " + lineItems[0]);


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
    
    public static void main(String[] args) {
        Receipt r = new Receipt();
        Product p = new Product("A101", "Baseball Hat", 19.95, new FlatRateDiscount(0.15));
        r.addLineItem(p, 7);
    }
}

