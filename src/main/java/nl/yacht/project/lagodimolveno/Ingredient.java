package nl.yacht.project.lagodimolveno;

public class Ingredient {
    private String name;
    private int stock;

    public Ingredient(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public int getStock(Ingredient ingredient) {
        return ingredient.stock;
    }


    public void setStock(Ingredient ingredient, int number) {
        this.stock = number;
        this.name = ingredient.name;
    }
}
