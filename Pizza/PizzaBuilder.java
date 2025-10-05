package Pizza;
import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private Pizza.Chain chain;
    private Pizza.Size size;
    private List<Pizza.Topping> toppings = new ArrayList<>();

    public PizzaBuilder setChain(Pizza.Chain chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(Pizza.Topping topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza makePizza() {
        if (chain == null || size == null) {
            throw new IllegalStateException("Chain and Size must be set before making a pizza.");
        } 
        return new Pizza(chain, size, toppings);
    }
}

