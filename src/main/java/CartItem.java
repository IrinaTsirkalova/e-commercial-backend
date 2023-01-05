public class CartItem {

    public CartItem(Product product, int quantity) {
        setProduct(product);
        setQuantity(quantity);
    }

    private Product product;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculate sum for item per quantity
     * @return
     */
    public double calculateSumForItemPerQuantity(){
        double sumPerQuantity = product.getPrice()* quantity;
        return Math.round(sumPerQuantity*100)/100.0;
    }

    /**
     * Prints item information:
     * - product/label/
     * - quantity
     * - sum for item per quantity
     */
    public void printItem(){
        System.out.println("Printing item information:"+ "\n"+
                "Label:" + product.getLabel()+
                "; Price per one item: "+product.getPrice()+
                "; Sum: " + calculateSumForItemPerQuantity()+"; Quantity: " + quantity);
        ;    }

}
