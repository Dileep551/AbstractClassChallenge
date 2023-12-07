abstract public class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalePrice(int quantity){

        return quantity * price;
    }

    public void printPricedItem(int quantity){

        System.out.printf("%2d quantity at $%8.2f each, %-15s %-35s %n", quantity, price, type, description);

    }

    public abstract void showDetails();

}
