import java.util.ArrayList;
import java.util.List;
public class pizza {
    private final String size;
    private final String crust;
    private final List<String> toppings;
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
    }
    @Override
    public String toString() {
        return "Pizza Order:\nSize: " + size + "\nCrust: " + crust + "\nToppings: " + toppings;
    }
    public static class PizzaBuilder { 
        private String size;
        private String crust;
        private List<String> toppings = new ArrayList<>();
        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }
        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }
        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
