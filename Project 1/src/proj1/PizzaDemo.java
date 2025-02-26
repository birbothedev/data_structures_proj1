package proj1;

import java.util.ArrayList;

public class PizzaDemo {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(Pizza.CrustType.GARLIC_BUTTER, new ArrayList<>(), Pizza.SizeType.LARGE);
        Pizza pizza2 = new Pizza(Pizza.CrustType.CHEESE, new ArrayList<>(), Pizza.SizeType.MEDIUM);

        pizza1.addToppings("cheese");
        pizza1.addToppings("pepperoni");
        pizza1.addToppings("onion");

        pizza2.addToppings("cheese");
        pizza2.addToppings("pepperoni");

        System.out.println(pizza2);
        System.out.println(pizza1);

        boolean equalPizzas = pizza1.equals(pizza2);
        if (equalPizzas){
            System.out.println("Pizzas are equal");
        } else {
            System.out.println("Pizzas are not equal");
        }

        int comparePizzas = pizza1.compareTo(pizza2);
        if (comparePizzas > 0){
            System.out.println("Pizza 1 is greater than Pizza 2.");
        } else if (comparePizzas == 0){
            System.out.println("Pizzas are equal.");
        } else {
            System.out.println("Pizza 2 is greater than Pizza 1.");
        }
    }
}