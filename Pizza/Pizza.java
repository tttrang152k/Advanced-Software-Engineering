package Pizza;
import java.util.List;

public class Pizza {
    private final Chain chain;
    private final Size size;
    private final List<Topping> toppings;

    enum Chain {
        DOMINOS, PIZZA_HUT, LITTLE_CAESARS
    }

    enum Size {
        SMALL, MEDIUM, LARGE
    }

    enum Topping {
        PEPPERONI, SAUSAGE, MUSHROOMS, BACON, ONIONS, PEPPERS, EXTRA_CHEESE,
        CHICKEN, OLIVES, SPINACH, TOMATO_BASIL, BEEF, HAM, PESTO, SPICY_PORK,
        HAM_PINEAPPLE
    }

    public Pizza(Chain chainName, Size size, List<Topping> toppings) {
        this.chain = chainName;
        this.size = size;
        this.toppings = toppings;
    }

    public Chain getChain() {
        return chain;
    }

    public Size getSize() {
        return size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public int getToppingCount() {
        return toppings.size();
    }

    public void eat() {
        System.out.print(chain + " " + size + " pizza (" + getToppingCount() + " toppings: ");
        for (Topping topping : toppings) {
            System.out.print(topping + ", ");
        }
        // Remove trailing comma and space
        if (!toppings.isEmpty()) {
            System.out.print("\b\b");
        }
        System.out.println(")");

    }
}
