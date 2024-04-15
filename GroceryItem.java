public class GroceryItem extends Item {
    private String brand;
    private String expirationDate;
    private String category;

    public GroceryItem() {
    };

    public GroceryItem(String name, double unitPrice, double taxPercentage, int quantityInStock,
            String brand, String expirationDate, String category) {
        super(name, unitPrice, taxPercentage, quantityInStock);
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getItemTotal() {
        return getQuantityInStock() * getUnitPrice() * (1 + getTaxPercentage());
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Expiration Date: " + expirationDate + ", Category: "
                + category;
    }

    public GroceryItem clone() {
        GroceryItem clonedItem = new GroceryItem(getName(), getUnitPrice(), getTaxPercentage(), getQuantityInStock(),
                brand, expirationDate, category);
        return clonedItem;
    }

}