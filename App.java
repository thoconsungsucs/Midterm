import java.util.Scanner;

public class App {
    public static Store store = new Store();

    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the store");

        Boolean flag = true;
        while (flag) {
            System.out.println("""
                    1. Add an item to the store
                    2. List items in the store
                    3. Add an item to the cart
                    4. Remove an item from the cart
                    5. Print the bill
                    6. Exit
                    """);

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    store.addItem();
                    break;
                case 2:
                    store.displayItems();
                    break;
                case 3:
                    store.displayItems();

                    System.out.println("Enter the ID of the item you want to add to the cart: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    Item item = store.getItems().stream().filter(i -> i.getID() == id).findFirst().orElse(null);
                    if (item == null) {
                        System.out.println("Item not found");
                        continue;
                    }

                    System.out.println("Enter the quantity of the item you want to add to the cart: ");
                    int quantity = scan.nextInt();
                    scan.nextLine();

                    if (quantity > item.getQuantityInStock()) {
                        System.out.println("Quantity exceeds the available stock");
                        continue;
                    }

                    if (item instanceof GroceryItem) {
                        GroceryItem groceryItem = (GroceryItem) item;
                        cart.addItemToCart(groceryItem.clone(), quantity);
                    } else if (item instanceof ElectronicsItem) {
                        ElectronicsItem electronicsItem = (ElectronicsItem) item;
                        cart.addItemToCart(electronicsItem.clone(), quantity);
                    } else if (item instanceof ClothingItem) {
                        ClothingItem clothingItem = (ClothingItem) item;
                        cart.addItemToCart(clothingItem.clone(), quantity);
                    }
                    break;

                case 4:
                    cart.displayCart();
                    int idRomoved = scan.nextInt();
                    scan.nextLine();
                    cart.removeItemFromCart(idRomoved);
                    break;

                case 5:
                    cart.printBill();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    break;
            }

        }
    }
}