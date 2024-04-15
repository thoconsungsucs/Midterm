public class ElectronicsItem extends Item {
    private int size;
    private int weight;
    private String warrantyPeriod;

    public ElectronicsItem(String name, double unitPrice, double taxPercentage, int quantityInStock,
            int size, int weight, String warrantyPeriod) {
        super(name, unitPrice, taxPercentage, quantityInStock);
        this.size = size;
        this.weight = weight;
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicsItem() {

    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public double getItemTotal() {
        return getQuantityInStock() * getUnitPrice() * (1 + getTaxPercentage());
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + ", size: " + size + ", Weight: " + this.weight + ", Warranty Period: "
                + warrantyPeriod;
    }

    public ElectronicsItem clone() {
        ElectronicsItem clonedItem = new ElectronicsItem(getName(), getUnitPrice(), getTaxPercentage(),
                getQuantityInStock(), size, weight, warrantyPeriod);
        return clonedItem;
    }

}