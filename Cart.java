import java.util.HashMap;

public class Cart {
    private HashMap<Item, Integer> cart;

    public Cart() {
        cart = new HashMap<>();
    }

    public void addItemToCart(Item item, int quantity) {

        if (cart.containsKey(item)) {
            cart.put(item, cart.get(item) + quantity);
        } else {
            cart.put(item, quantity);
        }

    }

    public void removeItemFromCart(int id) {
        Item itemRomoved = cart.keySet().stream().filter(i -> i.getID() == id).findFirst().orElse(null);
        if (itemRomoved == null) {
            System.out.println("Item not found");
            return;
        }
        cart.remove(itemRomoved);
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }
        cart.forEach((item, quantity) -> {
            System.out.println(item + ", Quantity: " + quantity);
        });
    }

    public void printBill() {
        System.out.println("Items in the cart: ");
        cart.forEach((item, quantity) -> {
            double totalPrice = item.getUnitPrice() * quantity * (1 + item.getTaxPercentage());
            System.out.println(item + ", Quantity: " + quantity + ", Unit Price: " + item.getUnitPrice()
                    + ", Total Price: " + totalPrice);
        });
    }

}
