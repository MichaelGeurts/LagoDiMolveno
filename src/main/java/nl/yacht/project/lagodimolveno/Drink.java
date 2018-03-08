package nl.yacht.project.lagodimolveno;

public class Drink {
    private String name;
    private boolean isAlcoholic;
    private boolean isHot;
    private double price;



    public Drink(String name, boolean isAlcoholic, boolean isHot, double price) {
        this.name = name;
        this.isAlcoholic = isAlcoholic;
        this.isHot = isHot;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public boolean isHot() {
        return isHot;
    }

    public double getPrice() {
        return price;
    }
}
