abstract class Item {
    private int id;
    private static int nextID = 1;
    private String name;
    private double unitPrice;
    private double taxPercentage;
    private int quantityInStock;

    public Item() {
        this.id = nextID++;
    }

    public Item(String name, double unitPrice, double taxPercentage, int quantityInStock) {
        this.id = nextID++;
        this.name = name;
        this.unitPrice = unitPrice;
        this.taxPercentage = taxPercentage;
        this.quantityInStock = quantityInStock;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTaxPercentage() {
        return this.taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public abstract double getItemTotal();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Unit Price: " + unitPrice + ", Tax Percentage: " + taxPercentage
                + ", Quantity in Stock: " + quantityInStock;
    }
}
