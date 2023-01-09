package deltasource.internship.ecommercial;

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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        if(product != null){
            this.product = product;
        }
    }

    public int getQuantity() {
        return quantity;
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
        return Math.round(sumPerQuantity * 100) / 100.0;
    }

    /**
     * Can be used to print item information
     * @return item information: product/label/, quantity, sum for item per quantity
     */
    public String printItem(){
        String itemInfo = "Printing item information:\n" +
                "Label:" + product.getLabel() +
                "; Price per one item: " + product.getPrice() +
                "; Sum: " + calculateSum() + "; Quantity: " + quantity + "\n";
        return itemInfo;
         }
}
