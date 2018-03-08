package nl.yacht.project.lagodimolveno;

import java.util.List;

public class Course {
    private String name;
    private double price;
    private List<Ingredient> ingredients;
    private CourseType courseType;
    private Categorie categories;

    public Course(String name, double price, List<Ingredient> ingredients, CourseType courseType, Categorie categories) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.courseType = courseType;
        this.categories = categories;
    }
}
