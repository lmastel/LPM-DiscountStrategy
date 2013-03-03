package lpm.discountstrategy;
 /**
 * FakeDatabae class for Discount Strategy Project
 * 
 * This class allow access to a "database" of customer and product information
 * 
 * @author Larry Mastel lmastel@my.wctc.edu
 * @version 1.00
 */
public class FakeDatabase {
 

    private Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
    };
    private Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new FlatRateDiscount(0.15)),
        new Product("B205", "Men's Dress Shirt", 35.50, new QuantityDiscount(.10, 5)),
        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
    };

    // Just call this method to find a customer in the array by its id.
    // Returns null if not found.
    public final Customer findCustomer(final String customerId) {
        // validation is needed
        Customer customer = null;
        for (Customer c : customers) {
            if (customerId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    // Just call this method to find a product in the array by its id.
    // Returns null if not found.
    public final Product findProduct(final String prodId) {
        // validation is needed
        Product product = null;
        for (Product p : products) {
            //if(prodId.equals(p.getProdId())) {
            if (prodId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }

        return product;
    }
}
