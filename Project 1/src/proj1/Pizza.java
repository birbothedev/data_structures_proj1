package proj1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private final ArrayList<String> toppings;
    private final List<String> valid_toppings = List.of("cheese", "onion", "green pepper",
            "ham", "pineapple", "pepperoni", "ground beef", "italian sausage", "anchovies");

    private SizeType size;

    public Pizza() {
        this.crust = CrustType.PLAIN;
        this.toppings = new ArrayList<>();
        this.size = SizeType.SMALL;
    }

    public Pizza(CrustType crust, ArrayList<String> toppings, SizeType size) {
        this.crust = crust;
        this.toppings = new ArrayList<>();
        for (String topping : toppings) {
            addToppings(topping);
        }
        this.size = size;
    }

    public void addToppings(String topping){
        // make sure toppings are in lower case otherwise it will give an error
        if(valid_toppings.contains(topping.toLowerCase())){
            toppings.add(topping.toLowerCase());
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
        // compare number of toppings
        int result = Integer.compare(this.toppings.size(), otherPizza.toppings.size());
        // if number of toppings are equal
        if (result == 0){
            // ordinal automatically finds the position (index) of the enum constant
            result = Integer.compare(this.crust.ordinal(), otherPizza.crust.ordinal());
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pizza otherPizza = (Pizza) obj;
        // return true if equal or return false if not equal
        return this.crust == otherPizza.crust &&
                this.toppings.size() == otherPizza.toppings.size();
    }
}

