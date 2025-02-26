package proj1;

import java.util.ArrayList;

public class Pizza {
    public enum CrustType {
        PLAIN,
        BUTTER,
        GARLIC,
        GARLICBUTTER,
        CHEESE;
    }

    private CrustType crust;
    private ArrayList<String> toppings;
    private SizeType size;

    public enum SizeType {
        SMALL,
        MEDIUM,
        LARGE,
        XLARGE,
        XXLARGE,
        PARTY;
    }

    public Pizza(CrustType crust, ArrayList<String> toppings, SizeType size) {
        this.crust = crust;
        this.toppings = new ArrayList<>(toppings);
        this.size = size;
    }

    public void addToppings(String topping){
        toppings.add(topping);
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
}

