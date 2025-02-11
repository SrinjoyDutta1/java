import java.util.ArrayList;
import java.util.List;




class PizzaBuilderSingleton {
    private static PizzaBuilderSingleton instance;
    private String size;
    private String crust;
    private List<String> toppings = new ArrayList<>();


    private PizzaBuilderSingleton() {}


    public static PizzaBuilderSingleton getInstance() {
        if (instance == null) {
            instance = new PizzaBuilderSingleton();
        }
        return instance;
    }


    public PizzaBuilderSingleton setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilderSingleton setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilderSingleton addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza(size, crust, toppings);
        return pizza;
    }
}

class Pizza {
    private final String size;
    private final String crust;
    private final List<String> toppings;

    public Pizza(String size, String crust, List<String> toppings) {
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>(toppings); // Defensive copy
    }

}

// Main Class
public class singleton {
    public static void main(String[] args) {
        // Get the Singleton instance
        PizzaBuilderSingleton pizzaBuilder = PizzaBuilderSingleton.getInstance();

        // Build a pizza
        Pizza myPizza = pizzaBuilder
                .setSize("Medium")
                .setCrust("Stuffed Crust")
                .addTopping("Cheese")
                .addTopping("Basil")
                .addTopping("Tomatoes")
                .build();

        
    }
}
