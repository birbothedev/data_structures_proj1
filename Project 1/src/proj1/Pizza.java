package proj1;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Comparable<Pizza> {
    public enum CrustType {
        PLAIN,
        BUTTER,
        GARLIC,
        GARLIC_BUTTER,
        CHEESE;
    }
    public enum SizeType {
        SMALL,
        MEDIUM,
        LARGE,
        XLARGE,
        XXLARGE,
        PARTY;
    }

    private CrustType crust;
    private ArrayList<String> toppings;
    private final List<String> valid_toppings = List.of("cheese", "onion", "green pepper",
            "ham", "pineapple", "pepperoni", "ground beef", "italian sausage", "anchovies");

    private SizeType size;

    public Pizza() {
        this.crust = CrustType.PLAIN;
        this.toppings = new ArrayList<>();
        this.size = SizeType.SMALL;
    }

    public void addToppings(String topping){
        if(valid_toppings.contains(topping)){
            toppings.add(topping);
        } else {
            System.out.println("Please choose a valid topping.");
        }
    }

    public ArrayList<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    public CrustType getCrust() {
        return crust;
    }

    public SizeType getSize() {
        return size;
    }

    public void setCrust(CrustType crust) {
        this.crust = crust;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    @Override
    public String toString(){
        if(toppings.isEmpty()){
            return "This pizza has a " + crust +
                    "crust and the following toppings:\n" +
                    "none";
        } else {
            return "This pizza has a " + crust +
                    "crust and the following toppings:\n" +
                    toppings;
        }
    }

    @Override
    public int compareTo(Pizza otherPizza){
        int result = Integer.compare(this.toppings.size(), otherPizza.toppings.size());
        if (result == 0){
            result = this.crust.compareTo(otherPizza.crust);
        }
        return result;
    }

    @Override
    public String equals(Pizza otherPizza){
        if (this.toppings.size() == otherPizza.toppings.size()){
            return "Pizzas are equal";
        }
    }
}

