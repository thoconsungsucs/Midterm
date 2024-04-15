class ClothingItem extends Item {
    private String size;
    private String material;
    private String color;

    public ClothingItem(String name, double unitPrice, double taxPercentage, int quantityInStock,
            String size, String material, String color) {
        super(name, unitPrice, taxPercentage, quantityInStock);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public ClothingItem() {

    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double getItemTotal() {
        return getQuantityInStock() * getUnitPrice() * (1 + getTaxPercentage());
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size + ", Material: " + material + ", Color: " + color;
    }

    public ClothingItem clone() {
        ClothingItem clonedItem = new ClothingItem(getName(), getUnitPrice(), getTaxPercentage(), getQuantityInStock(),
                size, material, color);
        return clonedItem;
    }
}