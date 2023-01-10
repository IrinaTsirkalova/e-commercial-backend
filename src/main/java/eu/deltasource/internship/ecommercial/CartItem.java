package eu.deltasource.internship.ecommercial;

/**
 * Represents an item that has a product and product quantity
 */
public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
    }

    public void setProduct(Product product) {
        if(product != null){
            this.product = product;
        }
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0){
            this.quantity = quantity;
        }
    }

    /**
     * Calculate sum for item per quantity
     * @return sum per quantity
     */
    public double calculateSum(){
        double sumPerQuantity = product.getPrice() * quantity;
        return sumPerQuantity;
    }

    /**
     * Can be used to print item information
     * @return item information: product/label/, quantity, sum for item per quantity
     */
    public String toString(){
        String productInfo = product.toString();
        return productInfo + ";\nPrinting item information:\nSum: "
                + String.format("%,.2f", calculateSum()) + "; Quantity: " + quantity + "\n";
    }
}
