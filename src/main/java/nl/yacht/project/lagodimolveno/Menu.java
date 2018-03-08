package nl.yacht.project.lagodimolveno;

import java.util.List;

public class Menu {
    private List<Drink> drinks;
    private List<Course> courses;

    public Menu(List<Drink> drinks, List<Course> courses) {
        this.drinks = drinks;
        this.courses = courses;
    }

    public void order(List<Drink> drink, List<Course> courses){

    }

    public void makeNote(String note){
    }

    public boolean isIngredientAffailable(Ingredient ingr){
        boolean result = true;
        return result;
    }

    public void editCourse(List<Course> courses){

    }

    public void payBill(){

    }
}
