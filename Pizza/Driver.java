package Pizza;

public class Driver {
    public static void main(String[] args) {
        // 3 pizzas - each size with 3, 6, and 9 toppings
        Pizza sm3 = new PizzaBuilder()
                .setChain(Pizza.Chain.DOMINOS)
                .setSize(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.MUSHROOMS)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .makePizza();
        sm3.eat();
        System.out.println();

        Pizza md6 = new PizzaBuilder()
                .setChain(Pizza.Chain.PIZZA_HUT)
                .setSize(Pizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.BACON)
                .addTopping(Pizza.Topping.ONIONS)
                .addTopping(Pizza.Topping.PEPPERS)
                .addTopping(Pizza.Topping.CHICKEN)
                .addTopping(Pizza.Topping.OLIVES)
                .makePizza();
        md6.eat();
        System.out.println();

        Pizza lg9 = new PizzaBuilder()
                .setChain(Pizza.Chain.PIZZA_HUT)
                .setSize(Pizza.Size.LARGE)
                .addTopping(Pizza.Topping.SPINACH)
                .addTopping(Pizza.Topping.TOMATO_BASIL)
                .addTopping(Pizza.Topping.BEEF)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.PESTO)
                .addTopping(Pizza.Topping.SPICY_PORK)
                .addTopping(Pizza.Topping.HAM_PINEAPPLE)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .addTopping(Pizza.Topping.MUSHROOMS)
                .makePizza();
        lg9.eat();
        System.out.println();

        // Make pizzas following hw prompt
        Pizza lgPH3 = new PizzaBuilder()
                .setChain(Pizza.Chain.PIZZA_HUT)
                .setSize(Pizza.Size.LARGE)
                .addTopping(Pizza.Topping.SPICY_PORK)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.SPINACH)
                .makePizza();

        Pizza smPH2 = new PizzaBuilder()
                .setChain(Pizza.Chain.PIZZA_HUT)
                .setSize(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM_PINEAPPLE)
                .addTopping(Pizza.Topping.TOMATO_BASIL)
                .makePizza();

        Pizza mdLC8 = new PizzaBuilder()
                .setChain(Pizza.Chain.LITTLE_CAESARS)
                .setSize(Pizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.BACON)
                .addTopping(Pizza.Topping.SPICY_PORK)
                .addTopping(Pizza.Topping.OLIVES)
                .addTopping(Pizza.Topping.PEPPERS)
                .addTopping(Pizza.Topping.PESTO)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.MUSHROOMS)
                .makePizza();

        Pizza smLC6 = new PizzaBuilder()
                .setChain(Pizza.Chain.LITTLE_CAESARS)
                .setSize(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.BEEF)
                .addTopping(Pizza.Topping.SPICY_PORK)
                .addTopping(Pizza.Topping.OLIVES)
                .addTopping(Pizza.Topping.ONIONS)
                .addTopping(Pizza.Topping.TOMATO_BASIL)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .makePizza();

        Pizza smD1 = new PizzaBuilder()
                .setChain(Pizza.Chain.DOMINOS)
                .setSize(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.BEEF)
                .makePizza();

        Pizza lgD3 = new PizzaBuilder()
                .setChain(Pizza.Chain.DOMINOS)
                .setSize(Pizza.Size.LARGE)
                .addTopping(Pizza.Topping.MUSHROOMS)
                .addTopping(Pizza.Topping.SPINACH)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .makePizza();

        lgPH3.eat();
        System.out.println();
        smPH2.eat();
        System.out.println();
        mdLC8.eat();
        System.out.println();
        smLC6.eat();
        System.out.println();
        smD1.eat();
        System.out.println();
        lgD3.eat();
        System.out.println();

    }
}
