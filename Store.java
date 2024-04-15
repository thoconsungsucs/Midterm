import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Item> items;

    public Store() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the type of item (1. Grocery, 2. Electronics, 3. Clothing): ");
        int choice = scan.nextInt();
        scan.nextLine();
        switch (choice) {
            case 1:
                GroceryItem groceryItem = new GroceryItem();
                System.out.println("Enter the name of the item: ");
                groceryItem.setName(scan.nextLine());
                System.out.println("Enter the unit price of the item: ");
                groceryItem.setUnitPrice(scan.nextDouble());
                System.out.println("Enter the tax percentage of the item: ");
                groceryItem.setTaxPercentage(scan.nextDouble());
                System.out.println("Enter the quantity in stock: ");
                groceryItem.setQuantityInStock(scan.nextInt());
                scan.nextLine();
                System.out.println("Enter the brand of the item: ");
                groceryItem.setBrand(scan.nextLine());
                System.out.println("Enter the expiration date of the item: ");
                groceryItem.setExpirationDate(scan.nextLine());
                System.out.println("Enter the category of the item: ");
                groceryItem.setCategory(scan.nextLine());
                items.add(groceryItem);
                break;

            case 2:
                ElectronicsItem electronicsItem = new ElectronicsItem();
                System.out.println("Enter the name of the item: ");
                electronicsItem.setName(scan.nextLine());
                System.out.println("Enter the unit price of the item: ");
                electronicsItem.setUnitPrice(scan.nextDouble());
                System.out.println("Enter the tax percentage of the item: ");
                electronicsItem.setTaxPercentage(scan.nextDouble());
                System.out.println("Enter the quantity in stock: ");
                electronicsItem.setQuantityInStock(scan.nextInt());
                System.out.println("Enter the size of the item: ");
                electronicsItem.setSize(scan.nextInt());
                System.out.println("Enter the weight of the item: ");
                electronicsItem.setWeight(scan.nextInt());
                scan.nextLine();
                System.out.println("Enter the warranty period of the item: ");
                electronicsItem.setWarrantyPeriod(scan.nextLine());
                items.add(electronicsItem);
                break;

            case 3:
                ClothingItem clothingItem = new ClothingItem();
                System.out.println("Enter the name of the item: ");
                clothingItem.setName(scan.nextLine());
                System.out.println("Enter the unit price of the item: ");
                clothingItem.setUnitPrice(scan.nextDouble());
                System.out.println("Enter the tax percentage of the item: ");
                clothingItem.setTaxPercentage(scan.nextDouble());
                System.out.println("Enter the quantity in stock: ");
                clothingItem.setQuantityInStock(scan.nextInt());
                System.out.println("Enter the size of the item: ");
                clothingItem.setSize(scan.nextLine());
                System.out.println("Enter the material of the item: ");
                clothingItem.setMaterial(scan.nextLine());
                System.out.println("Enter the color of the item: ");
                clothingItem.setColor(scan.nextLine());
                items.add(clothingItem);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void displayItems() {
        System.out.println("Items in the store: ");
        items.forEach(i -> System.out.println(i.toString()));
    }
}
